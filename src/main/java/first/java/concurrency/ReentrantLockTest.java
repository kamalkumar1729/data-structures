package first.java.concurrency;

import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class ReentrantLockTest implements Runnable {

    /** single lock for all threads */
    static ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {
        IntStream.range(1, 20).forEach(i -> new Thread(new ReentrantLockTest()).start());
    }

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println("Hello from " + Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Do Nothing
        } finally {
            lock.unlock();
        }
    }
}