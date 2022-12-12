package first.java.concurrency;

public class CustomLock {

    static MyLock lock = new MyLock();

    public static void main(String[] args) throws InterruptedException {

       new Thread(() -> {
            try {
                sayHello();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


        new Thread(() -> {
            try {
                sayHello();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }

    private static void sayHello() throws InterruptedException {
        lock.lock();
        System.out.println("Hello");
        Thread.sleep(5000);
        lock.unlock();
    }

    static class MyLock {
        private Boolean isLocked = false;

        synchronized void lock() throws InterruptedException {
            /** wait until other threads are having lock */
            while (isLocked) {
                wait();
            }
            /** if false then make true and block others */
            isLocked = true;
        }
        synchronized void unlock() {
            isLocked = false;
            notifyAll();
        }
    }
}