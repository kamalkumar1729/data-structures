package first.java.concurrency;

public class WaitNotify {

    private static Integer count = 0;

    public static void main(String[] args) throws InterruptedException {

        Object o = new Object();

        Thread t = new Thread(() -> {
            try {
                synchronized (count) {
                    o.wait(2000);
                }
            } catch (InterruptedException e) {
                System.out.println("I am interrupted");
            }
            System.out.println("I am awake now");
        });

        t.start();

        System.out.println("I will wake thread in 5 secs");
        Thread.sleep(5000);

        t.interrupt();

        System.out.println(t.getState());

        synchronized (o) {
            o.notify();
        }
    }
}
