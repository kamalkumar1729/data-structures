package dp;

public class RodCutting2 {

    /* price(i) = price[i]*/
    private static final int[] prices = {0, 1, 5, 8, 9, 10, 17, 17, 20};

    private static final int[] sol = new int[20];

    public static void main(String[] args) {
        // System.out.println(cutRodRecursive(8));
        //System.out.println(cutRodMemo(8));
        System.out.println(cutRodDP(8));
    }

    private static int cutRodRecursive(int len) {
       // System.out.println("len = "+len);
        if (len == 0) return 0;

        //int max = -99999;
        int maxProfit = prices[len];

        for (int i = 1; i <= len; i++) {
            int profitByCutting = prices[i] + cutRodRecursive(len - i);
            maxProfit = Math.max(maxProfit,profitByCutting);
           // System.out.println(max);
        }
        return maxProfit;
    }


    private static int cutRodMemo(int len) {
        /* to reduce recomputing some cutRod(n) we need to store result */
        /* on function call check if present in sol if yes return else compute;*/
        if (len == 0) return 0;

        /* check if sol is there if yes return */
        if (sol[len] != 0) return sol[len];
        /* else compute */

        // int max = -99999;
        int maxProfit = prices[len];

        for (int i = 1; i <= len; i++) {
            int profitByCutting = prices[i] + cutRodRecursive(len - i);
            maxProfit = Math.max(maxProfit,profitByCutting);
            sol[len] = maxProfit;
        }
        return sol[len];
    }


    private static int cutRodDP(int len) {

        /* manual solution initializations */
        sol[1] = 1;
        sol[2] = 5;

        for (int i = 3; i <= len; i++) {
            int maxProfit = prices[i];
            for (int j = 1; j < i; j++) {
                maxProfit = Math.max(maxProfit, prices[j] + sol[i-j]);
            }
            sol[i] = maxProfit;
        }
        return sol[len];
    }
}
