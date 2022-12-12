package first.java.concurrency;

import java.util.concurrent.locks.StampedLock;

public class StampedLockTest {

    /**
     *  Introduced in Java-8
     *  It is ReadWriteLock only.
     *  1. Not reentrant
     *  2. Optimistic lock
     *
     * */

    public static void main(String[] args) {

        StampedLock lock = new StampedLock();

        long stampReadLock = lock.readLock();

        long stampWriteLock = lock.writeLock();

        lock.unlock(stampReadLock);
        lock.unlock(stampWriteLock);

    }
}