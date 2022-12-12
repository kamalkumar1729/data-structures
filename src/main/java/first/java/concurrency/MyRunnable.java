package first.java.concurrency;

public class MyRunnable implements Runnable {

    private final BankAccount account;

    public MyRunnable(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {

        account.deposit(2.00);
        account.withdraw(1.00);

       /* try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

      /*  System.out.println("MyRunnable :- "+ Thread.currentThread().getName());
        System.out.println("Sleeping");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Waked up");*/
    }
}