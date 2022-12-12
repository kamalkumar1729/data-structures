package first.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/** Basic Executors factory methods ,
 * simple Runnable executions */

public class ExecutorServiceTest1 {

    public static void main(String[] args) {
        // fixedThreadPool();
        // cachedThreadPool();
        scheduledThreadPool();
    }

    static void fixedThreadPool() {

        /** Will not shutdown after finishing tasks
         * Needs to shutdown explicitly */

        System.out.println("FixedThreadPool");
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.execute(new MyTask());
    }

    static void cachedThreadPool() {

        /** Will Shutdown itself after finishing tasks
         * Threads are killed if idle for 60 seconds */

        System.out.println("CachedThreadPool");
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new MyTask());
    }

    static void scheduledThreadPool() {

        /** Will not shutdown after finishing tasks
         * Needs to shutdown explicitly */

        System.out.println("ScheduledThreadPool");
        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);


        /** schedules in future one time */
        // service.schedule(new MyTask(),5, TimeUnit.SECONDS);



        /** schedules at regular intervals */
        service.scheduleAtFixedRate(new MyTask(),0,5,TimeUnit.SECONDS);

        // service.execute(new MyTask());
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Doing Task.  " + Thread.currentThread().getName());
        }
    }
}