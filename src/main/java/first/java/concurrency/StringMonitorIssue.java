package first.java.concurrency;

public class StringMonitorIssue {

    static final String string1 = "kamal";
    static final String string2 = "kamal";


    /**
     *  Even though thread-1 and thread-2 are locking different first.ds.strings,
     *  they will execute serially.
     *  Thread-2 will execute after thread-1 ,
     *  because string -1 and string-2 are same object in memory.
     *
     * */

    public static void main(String[] args)  {

        Thread thread1 = new Thread( () -> {
            synchronized (string1) {
                System.out.println("Thread-1, I have lock now on string-1 ");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread( () -> {
            synchronized (string2) {
                System.out.println("Thread-2, I have lock now on string-2 ");
            }
        });


        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

       //  System.out.println(thread1.getPriority());
       // System.out.println(thread2.getPriority());

       // thread1.start();
       // thread2.start();


        Thread tt = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("I am interrupted ");
            }
            System.out.println("Hi, I am  Deamon Thread");
        });

       // tt.setDaemon(true);
        tt.start();
        tt.interrupt();
    }
}