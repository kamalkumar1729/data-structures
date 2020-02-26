package sorting;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] arr = new int[] {6,3,4,7,5,3,5,2,6,78,9,3,1,5,6};
        char[] chars = "civilization".toCharArray();
        bubbleSortInts(arr);
        bubbleSortChars(chars);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(chars));
    }

    private static void bubbleSortInts(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i+1; j < arr.length; j++)
                if (arr[i] > arr[j]) {  // swap(arr[i],arr[j]);
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    }

    private static void bubbleSortChars(char[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i+1; j < arr.length; j++)
                if (arr[i] > arr[j]) {  // swap(arr[i],arr[j]);
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    }
}
