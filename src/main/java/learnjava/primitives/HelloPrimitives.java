package learnjava.primitives;


public class HelloPrimitives {

    static {
        System.out.println("static");
    }

    public HelloPrimitives() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {

        new HelloPrimitives();

        byte bb = 127;
       // System.out.println(bb);


        char c = 'A';
       // System.out.println(c);


        int age = 27;
        changeIt(age);
        System.out.println(age);


    }

    private static void changeIt(int cc) {
        cc = 3;
    }
}
