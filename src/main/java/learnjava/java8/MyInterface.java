package learnjava.java8;

import java.util.Date;

public interface MyInterface {

    void printThis(Object o);

    static void printHello() {
        System.out.println("Hello");
    }

    default void printDate() {
        System.out.println(new Date().toString());
    }
}
