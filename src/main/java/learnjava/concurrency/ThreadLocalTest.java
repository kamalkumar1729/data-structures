package learnjava.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadLocalTest {

    static ThreadLocal<String> SharedName = new ThreadLocal<>();

    static ThreadLocal<Greet> SharedGreet = new ThreadLocal<>();

    public static void main(String[] args) {

       /* Greet greet = new Greet();
        greet.setName("Kamal");
        greet.setAge(27);*/

        SharedName.withInitial(() -> "Kamal");

        new Thread(() -> {
            System.out.println(SharedName.get());
            System.out.println(SharedName.get());
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(SharedName.get());
        }).start();


        Class<Greet> object = Greet.class;
        System.out.println(object);


        ExecutorService service = Executors.newFixedThreadPool(24);
        service.submit(new FttxReportGenerationTask());

    }

    static class FttxReportGenerationTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello. My name is " + Thread.currentThread().getName());
        }
    }
}