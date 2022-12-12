package first.java.java8;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        System.out.println();
        Process notepad = runtime.exec("notepad");
    }
}