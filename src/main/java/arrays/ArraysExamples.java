package arrays;

import java.util.Arrays;

public class ArraysExamples {
    public static void main(String[] args) {

        /* The [] is part of the TYPE, not of the variable NAME.*/
        /*  type[] arr ; */

        // todo
        //  Once the length of the array is defined,
        //  it cannot be changed in the program.
        //  arr.length

        String[] arr = new String[10];
        int[] arr3 = new int[] {10222, 200, 32220, 4222, 500, 60, 798, 80, 19, 0};
        char[] chars = new char[] {'1', 'z', '8', '0', '4', 'a', 'b'};
        Character chr = 'c';
        char[] letters = new char[10];
        String name = "Kamal";


        System.out.println(letters.length);


        /* charArray <=> String */
        char[] chars1 = "Formic Acid".toCharArray();
        String string = new String(chars1);

        /* char <=> String */
        char ch = "a".charAt(0);
        String str = Character.toString(ch);





        System.out.println("           ".toCharArray().length);
        System.out.println("           ".length());


       // System.out.println("kamal".toCharArray().length);
        // System.out.println(string);
        //printChars(chars);
        //printArray(chars);
    }

    private static void printChars(char[] arr) {
        char[] myArr = arr.clone();
        Arrays.sort(myArr);
        System.out.println(myArr);
    }

    private static void printArray(char[] arr) {
        final String s = Arrays.toString(arr);
        System.out.println(s.contains(""));
        String s1 = "kamal";
    }


























}
