package javalearn;

public class Oracle implements IDataAccess {
    public static void main(String[] args) {
        System.out.println(new Oracle().getMaxNumberOfConn("ORACLE"));
    }
}
