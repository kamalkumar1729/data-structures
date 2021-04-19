package learnjava.concurrency;

import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) throws Exception {

        String name = "Kamal Kumar";

        System.out.println(name);
        System.out.println(Arrays.toString(args));

        // Lock lock = new

        for (int i = 0; i < 50; i++) {
            Thread t = new Thread(() -> {
                System.out.println("Hello, I am " + Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t.start();
            t.join();
        }
    }
}