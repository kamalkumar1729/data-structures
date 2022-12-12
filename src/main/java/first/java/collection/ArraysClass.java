package first.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysClass {
    public static void main(String[] args) {

        Integer[] arr = new Integer[] {10,2,33,345,56,245,245,346,3451,14,57,87895,6351,4145,43562,499,534,346,27};

        /*sort the array */
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));


        /* Binary search only after Arrays.sort() call */
        System.out.println(Arrays.binarySearch(arr, 1729));

        Arrays.fill(arr,100);

        System.out.println(Arrays.toString(arr));


        List<String> strings = Arrays.asList("kamal", "kumar");


    }
}
