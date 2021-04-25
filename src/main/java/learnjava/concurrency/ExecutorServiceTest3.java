package learnjava.concurrency;


import java.util.concurrent.*;

/** Callable and Futures */

public class ExecutorServiceTest3 {

    private static final ExecutorService executor = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {

        Future<Integer> myFuture = executor.submit(new MyCallableTask("MondayMorning"));

        try {
            System.out.println("getting value from future ");
            myFuture.cancel(true);
            Integer len = myFuture.get();
            System.out.println("Length is " + len);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("main finished");
    }

    static class MyCallableTask implements Callable<Integer> {
        private final String taskName;

        public MyCallableTask(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public Integer call() {
            System.out.println(Thread.currentThread().getName() + " Started " + taskName);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("I am interrupted.");            }
            System.out.println(Thread.currentThread().getName() + " Finished " + taskName);
            return taskName.length();
        }
    }
}
