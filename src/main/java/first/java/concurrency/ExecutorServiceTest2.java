package first.java.concurrency;


import java.util.List;
import java.util.concurrent.*;

/** Executors Operations
 * shutdown, shutdownNow, awaitTermination  */

public class ExecutorServiceTest2 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);

        service.execute(new MyTask("Coffee"));
        service.execute(new MyTask("Tea"));


        Future<?> milkFuture = service.submit(new MyTask("Milk"));

        try {
            /** returns null */
            System.out.println(milkFuture.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // awaitTermination(service);
    }

    static void awaitTermination(ExecutorService service) {
        try {
            boolean b = service.awaitTermination(10, TimeUnit.SECONDS);
            if (b) {
                System.out.println("AllTasks Finished");
            } else {
                System.out.println("AllTasks Not Finished");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void shutdown(ExecutorService service) {
        service.shutdown();
    }

    static void shutdownNow(ExecutorService service) {
        List<Runnable> runnableList = service.shutdownNow();
        runnableList.forEach(Runnable::run);
        // will throw RejectedExecutionException
        service.execute(new MyTask("Water"));
    }


    static class MyTask implements Runnable {
        private final String taskName;

        public MyTask(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " Started " + taskName);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                return;
            }
            System.out.println(Thread.currentThread().getName() + " Finished " + taskName);
        }
    }
}
