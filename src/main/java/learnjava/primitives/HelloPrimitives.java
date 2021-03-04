package learnjava.primitives;

public class HelloPrimitives {
    public static void main(String[] args) {


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
