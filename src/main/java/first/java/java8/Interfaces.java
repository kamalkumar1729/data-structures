package first.java.java8;

import java.util.function.Function;

public class Interfaces {
    public static void main(String[] args) {
        MyInterface myInterface = (Object o) -> System.out.println("Printing : " + o.toString());
        myInterface.printThis("Kamal Kumar");
        Function<String, Integer> findLength = s -> {return s.length(); };
        System.out.println(findLength.apply("kamal"));
    }
}