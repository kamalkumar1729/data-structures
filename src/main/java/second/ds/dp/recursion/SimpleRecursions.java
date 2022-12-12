package second.ds.dp.recursion;

public class SimpleRecursions {

    public static void main(String[] args) {

       // System.out.println(fac(5));
       // System.out.println(fib(50));
       // System.out.println(totalWays(15));
        printPermutations("","abcd");

    }

    private static int fac(int res) {
        if (res != 0)
            return res * fac(res - 1);
        else return 1;
    }


    static int fib(int n) {

        // base cases
       // if (n ==1 || n ==2) return 1;
        // return fib(n-1) + fib(n-2);

        return (n==1 || n ==2) ? 1 : fib(n-1) + fib(n-2);


    }

    static int totalWays(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return  totalWays(n-1) + totalWays(n-2);
    }



    static void printPermutations (String result, String input) {

        if (input.isEmpty()) {
            System.out.println(result);
            return;
        }

        printPermutations(result + input.charAt(0), input.substring(1));
        printPermutations(result, input.substring(1));

    }



    static void sortArray(int[] arr) {}



}