package arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        int len = arr.length,temp;
        for (int i = 0; i < len/2; i++) {
            temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1]=temp;
        }
    }
}
