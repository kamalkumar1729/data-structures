package first.java.concurrency.questions;


import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/** ProducerConsumer using BlockingQueue */

public class ProducerConsumer {

    private static final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {

        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();

    }

    static class Producer implements Runnable {
        private final BlockingQueue<Integer> queue;
        public Producer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                try {
                    int ran = new Random().nextInt();
                    System.out.println("adding : "+ ran);
                    queue.put(ran);
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        private final BlockingQueue<Integer> queue;
        public Consumer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                try {
                    Integer take = queue.take();
                    System.out.println("taken  : " + take);
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
