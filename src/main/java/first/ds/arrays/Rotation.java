package first.ds.arrays;

import java.util.Arrays;

public class Rotation {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3};
        System.out.println(Arrays.toString(rotateArray(arr,2)));
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

    private static void rotateArray2(int[] arr , int d) {
        // Reverse first part;
        // Reverse second part;
        // Now reverse the whole array;
    }

}
