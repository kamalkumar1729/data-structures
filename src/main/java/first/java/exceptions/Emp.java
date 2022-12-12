package first.java.exceptions;

public class Emp {
    private String name;
    private int age;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object deleted");
        super.finalize();
    }
}
