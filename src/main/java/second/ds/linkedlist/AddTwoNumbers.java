package second.ds.linkedlist;

import java.util.Arrays;

public class AddTwoNumbers {

    public static void main(String[] args) {


        int[] num1 = new int[] { 3,2,4,5,6,9,2,3,8,1 };
        int[] num2 = new int[]           { 4,7,2,5,8 };


        // add using parity (hasil)

        // start adding from right side until smaller number exhausts.

        // assuming j > i


        int i = num1.length - 1;
        int j = num2.length - 1;

        int[] result = new int[num1.length];
        int carry = 0 ;



        // jab tak chota number kahatam
        // nahi ho jaata add karte raho.

        while (j >= 0) {

            int sum = num1[i] + num2[j] + carry;

            result[i] = sum % 10;
            carry = sum / 10;

            i --;
            j --;
        }


        // baaki bache huye bade number ko
        // add karo using the pending parity.

        while (i >= 0) {

            int sum = num1[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;

            i-- ;

        }



        // if carry is still left.

        System.out.println("Carry = " + carry);








        System.out.println(Arrays.toString(result));

    }
}
