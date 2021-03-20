package learnjava.java8;

import java.util.function.Function;

public class Interfaces {
    public static void main(String[] args) {
        MyInterface myInterface = (Object o) -> System.out.println("Printing : " + o.toString());
        myInterface.printThis("Kamal Kumar");
        Function<String, Integer> findLength = String::length;
        System.out.println(findLength.apply("kamal"));
    }
}