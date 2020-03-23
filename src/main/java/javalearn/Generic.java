package javalearn;

public class Generic {

    static class Animal<T> {
        T age;
        T getAge() {
            return age;
        }
        void setAge(T age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Animal<Integer> animal = new Animal<>();
        animal.setAge(3);
        System.out.println(animal.getAge());
    }
}
