package learnjava.concurrency;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {

    static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) throws InterruptedException {

        new Thread(new ReaderTask()).start();
        new Thread(new WriterTask()).start();
        new Thread(new ReaderTask()).start();
        new Thread(new ReaderTask()).start();
        new Thread(new ReaderTask()).start();
        new Thread(new WriterTask()).start();
        new Thread(new ReaderTask()).start();
        new Thread(new ReaderTask()).start();
        new Thread(new ReaderTask()).start();
        new Thread(new WriterTask()).start();
        new Thread(new ReaderTask()).start();
        new Thread(new ReaderTask()).start();
        new Thread(new ReaderTask()).start();

    }


    static class ReaderTask implements Runnable {
        @Override
        public void run() {
            System.out.println("locked by writer : " + readWriteLock.isWriteLocked());
            readWriteLock.readLock().lock();
            try {
                System.out.println("reading by " + Thread.currentThread().getName());
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                readWriteLock.readLock().unlock();
            }
        }
    }

    static class WriterTask implements Runnable {
        @Override
        public void run() {
            readWriteLock.writeLock().lock();
            try {
                System.out.println("writing by : " + Thread.currentThread().getName());
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                readWriteLock.writeLock().unlock();
            }
        }
    }
}
