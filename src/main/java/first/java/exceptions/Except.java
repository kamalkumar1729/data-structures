package first.java.exceptions;

public class Except {
    public static void main(String[] args) {
      //  System.out.println("Hello Exceptions");
        int a = 9, b=0;


        Emp e1 = new Emp();
        Emp e2 = new Emp();

        e2 = e1;

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(a/b);
        } catch (Exception e ) {}
        finally {
            System.out.println("Finally Block");
        }
        System.out.println("After exception");


        new Except().HelloException();


    }


    private String HelloException()  {
        System.out.println("Hello Exception");
        return "Hello".split(",")[3];
    }
}
