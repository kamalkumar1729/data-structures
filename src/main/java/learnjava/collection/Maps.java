package learnjava.collection;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,Student> map = new HashMap<>();

        Student student1 = new Student("AA",101,12);
        Student student2 = new Student("BB",102,13);
        Student student3 = new Student("CC",103,14);


        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());


        System.out.println("Hello");
        student3=student2;

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());


    }
}
