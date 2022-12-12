package first.java.concurrency;

public class SynchronizedTest {

    public static void main(String[] args) {

        final Greet greet = new Greet();

        /** static methods will put lock on class itself */

        new Thread(Greet::staticSayHello).start();
        new Thread(Greet::staticSayNamaste).start();

        System.out.println(Greet.class == greet.getClass());
        greet.sayGoodMorning();

    }
}
