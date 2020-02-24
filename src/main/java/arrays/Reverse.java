package arrays;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        reverseArray3(arr);
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

    private static void reverseArray2(int[] arr) {
        int len = arr.length, temp;
        int start = 0, end = len-1;
        while (start <= len/2) {
            // swap arr[start] <=> arr[end]
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }

    // swap (arr[i],arr[len-1-i])
    // No extra variable
    private static void reverseArray3(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i] + arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i] - arr[arr.length-1-i];
            arr[i] = arr[i] - arr[arr.length-1-i];
        }
    }
}
