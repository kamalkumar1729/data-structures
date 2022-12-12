package first.java.collection;

import java.util.Arrays;
import java.util.Comparator;

public class HelloArrays {
    public static void main(String[] args) {

        String[] namesArray = new String[20];

        for (int i = 0; i < namesArray.length; i++) {
            namesArray[i] = String.valueOf(i);
        }


        /*Arrays are objects in java */
        // System.out.println(namesArray instanceof Object);


       // System.out.println(Student.class.isInstance(new Student("ss",120,11)));


        //System.out.println(namesArray.hashCode());

        // System.out.println(names.length);






        Student[] students = new Student[4];
        students[0] = new Student("Rajesh",10,17);
        students[1] = new Student("Reema",10,18);
        students[2] = new Student("Rohit" ,10,15);
        students[3] = new Student("Rahul",10,15);



        // System.out.println("student null check " + students[0] == null);
        // System.out.println(students[0].getAge()); //NPE

        Arrays.sort(students, Comparator.comparing(Student::getName));


        for (Student student : students) {
            System.out.println(student.toString());
        }



        int[] ages = new int[] {1,2,2,3,6,8,3,4,5,6,8,2};

        Arrays.sort(ages);

        for (int age : ages) {
           // System.out.println(age);
        }

    }

}
