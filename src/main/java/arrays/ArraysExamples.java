package arrays;

import java.util.HashSet;

public class ArraysExamples {
    public static void main(String[] args) {

        /* The [] is part of the TYPE, not of the variable NAME.*/
        /*  type[] arr ; */

        String[] arr = new String[10];
        int[] arr3 = new int[]{10222, 200, 32220, 4222, 500, 60, 798, 80, 19, 0};

       /* System.out.println('m'-'0');*/

        //System.out.println(Integer.toString(1234567).charAt(5));

        char[] chars = new char[] {'1','2','3','4','5','6','7'};

        System.out.println(chars);
    }

    public static int colorful(int a) {
        String A = Integer.toString(a);
        HashSet<Integer> set = new HashSet<Integer>();
        int prod = 0;
        for(int i = 0; i < A.length(); i++) {
            prod = 1;
            for(int j = i; j < A.length(); j++ ) {
                System.out.print(" char=" + A.charAt(j) + " ");
                prod *= A.charAt(j) - '0';

                if (set.contains(prod)) {
                    return 0;
                } else {
                    set.add(prod);
                    System.out.print(" prod =>" + prod + " ");
                }
            }
        }
        return 1;
    }
}
