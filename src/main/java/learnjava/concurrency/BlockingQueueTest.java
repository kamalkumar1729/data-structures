package learnjava.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueTest {

    final static BlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);

    final static BlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>(1);

    public static void main(String[] args) throws InterruptedException {
        arrayBlockingQueue();
    }

    private static void arrayBlockingQueue() throws InterruptedException {
        new Thread(() -> {
            String take = null;
            try {
                take = arrayBlockingQueue.take();
            } catch (InterruptedException e) {
                System.out.println("I am interrupted.");
            }
            System.out.println("taken element is " + take);
        }).start();
        Thread.sleep(5000);
        arrayBlockingQueue.add("KAMAL");
    }
}