package recursion;

import java.util.Date;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(new Date().toString());
        System.out.println(fib(70));
        System.out.println(new Date().toString());
    }

    private static long fib(long n) {
        if (n==1 || n==2) return 1;
        else return fib(n-1) + fib(n-2);
    }

    private static long fibIterative(long n) {
        long a = 1, b = 1, terms = 3, c = 0;
        if (n == 1 || n == 2) return 1;
        for (long i = terms; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
