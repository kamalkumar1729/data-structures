package learnjava.java8;

public interface IEatable {

    default void eatNow() {
        System.out.println("Eating");
    }

    String taste();

    void peel();
}
