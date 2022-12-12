package first.ds.recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(15));
       // System.out.println(fac(15,1));
    }

    /* first.ds.recursion */
    private static long fac(long n) {
        System.out.println("called for "+ n);
        if (n==0 || n==1) return 1;
        else return n*fac(n-1);
    }

    /* tail first.ds.recursion */
    private static long fac(long n, long result) {
        if (n==0|| n==1) return result;
        else return fac(n-1,n*result);
    }
}
