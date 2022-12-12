package daily;

public class Practice {

    public static void main(String[] args) {

        // findMax();

        sortArray();

    }


    private static void sortArray() {

        int[] arr = {23,34,345,345,2341,9934,345,456,56,856,7856,745};

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                // if any element is shorter than ith then swap
                if (arr[j] < arr[i]) {

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println();
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }




    private static void findMax() {
        int[] arr = {23,34,345,345,2341,9934,345,456,56,856,7856,745};

        String[] names = {"kamal","kumar","simran", "hello", "there" };

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);

    }

}