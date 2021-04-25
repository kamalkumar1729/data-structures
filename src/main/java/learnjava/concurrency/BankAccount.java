package learnjava.concurrency;

public class BankAccount {

    private String number;
    private Double balance = 0.00;
    private String owner;

    public BankAccount(String number, String owner) {
        this.number = number;
        this.owner = owner;
    }

    synchronized static void depositStatic(Double amount) {
        System.out.println("static deposit : " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //synchronized
    Double deposit(Double amount) {
        System.out.println("deposit : " + Thread.currentThread().getName());

        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance += amount;
            return balance;
        }
    }

    //synchronized
    Double withdraw(Double amount) {
        System.out.println("withdraw : " + Thread.currentThread().getName());

        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            return balance;
        }
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public synchronized static Double getBalance() {
        return 10.5;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", owner='" + owner + '\'' +
                '}';
    }
}
