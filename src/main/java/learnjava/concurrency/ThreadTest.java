package learnjava.concurrency;

public class ThreadTest {

    /**
     * All synchronized blocks on same object will be executed SERIALLY by multiple threads.
     * As thread will acquire lock on object and release after finishing it only.
     * */

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];
        BankAccount account = new BankAccount("072200100134235", "Kamal Kumar");

        for (int i = 0; i < 10; i++) {
            threads[i] = new MyThread(account);
            threads[i].setName("T-"+i);
            threads[i].start();
        }

        Thread.sleep(20000);

        System.out.println("Balance - " +account.getBalance());
    }
}