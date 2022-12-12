package first.java.oops;

import java.util.Arrays;

public class Inheritance {

    int getAge(){return  1;}

    public static void main(String[] args) {

       // Employee employee = new Employee("Kamal Kumar ",23,2016);
       // Employee employee1 = new Employee();

        Developer developer = new Developer("Karnal");
        //System.out.println(developer.toString());
      //  System.out.println(developer.getAge());

        int ll = new Employee("kamal",127,1008).height;

        Employee developer1 = new Developer();
        developer1.myMotto();

         Inheritance.main(new int[]{1,2,3,4});

    }

    public static void main(int[] args) {
        System.out.println("Hello, I am overloaded main method");
        System.out.println(Arrays.toString(args));
    }

}