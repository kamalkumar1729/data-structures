package first.ds.dp;

public class RodCutting {

    private static int[] prices = {0, 1, 5, 8, 9, 10, 17, 17, 20};

    private static int[] profit = new int[20];

    public static void main(String[] args) {
        System.out.println(maxProfitForLength(4));
    }

    private static int maxProfitForLength(final int len) {
        if (len == 1) return prices[1];
        int directProfit = prices[len];
        for (int i = 1; i < len; i++) {
            int dividedProfit = maxProfitForLength(i) + maxProfitForLength(len - i);
            if (dividedProfit > directProfit)
                directProfit = dividedProfit;
        }
        return directProfit;
    }

    private static int maxProfitForLengthDP(int len) {
        profit[1] = 1;
        profit[2] = 5;
        return 0;
    }
}