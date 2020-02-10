package arrays;

import java.util.Arrays;

public class Rotation {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3};
        printArray(rotateArray(arr,2));
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static int[] rotateArray(int[] arr, int places) {
        int len = arr.length, j=0;
        int[] newArr = new int[len];

        for (int i = places; i < len; i++) {
            newArr[j] = arr[i]; j++;
        }

        for (int i = 0; i < places; i++) {
            newArr[j] = arr[i]; j++;
        }
        return newArr;
    }
}
