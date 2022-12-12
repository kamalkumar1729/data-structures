package first.java.concurrency;

public class Greet {

    private String name;

    private int age;

    public void sayGoodMorning() {
        System.out.println( Thread.currentThread().getName()+ " Good Morning " + name  );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static void staticSayHello() {
        System.out.println(Thread.currentThread().getName() + " Hello");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("staticSayHello : I am interrupted !! ");
        }
    }

    public synchronized static void staticSayNamaste() {
        System.out.println(Thread.currentThread().getName() + " Namaste");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("staticSayNamaste : I am interrupted !! ");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}