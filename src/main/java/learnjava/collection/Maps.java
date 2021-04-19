package learnjava.collection;

import java.util.*;

public class Maps {


    public static void main(String[] args) {
        Map<String,Student> map = new HashMap<>();

        Student student1 = new Student("AA",null,12);
        Student student2 = new Student("BB",102,13);
        Student student3 = new Student("CC",13,14);
        Student student4 = new Student("DD",104,14);
        Student student5 = new Student("EE",null,14);

       // System.out.println(student1.hashCode());
       // System.out.println(student2.hashCode());
       // System.out.println(student3.hashCode());


       // System.out.println("Hello");
       // student3=student2;

        // System.out.println(student1.hashCode());
        // System.out.println(student2.hashCode());
        // System.out.println(student3.hashCode());


        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });

        list.forEach(student -> System.out.println(student.toString()));


    }
}
