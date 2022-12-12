package first.java.collection;

import java.util.*;

public class CollectionAPI {

    public static void main(String[] args) {

        System.out.println("Hello Collections :- ");

        List<Student> studentList = new ArrayList();

        studentList.add(new Student("Ram", 101, 15));
        studentList.add(new Student("Premkumar", 102, 16));
        studentList.add(new Student("Radhe", 103, 17));
        studentList.add(new Student("Shayam", 104, 19));


        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        /* nomadic */

        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }
}