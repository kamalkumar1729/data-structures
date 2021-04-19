package learnjava.concurrency;

public class MyThread extends Thread {

    private final BankAccount account;

    public MyThread(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        BankAccount.depositStatic(5.00);
        // account.deposit(2.00);
       // account.withdraw(1.00);
    }
}