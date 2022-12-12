package first.ds.dp;


/* https://www.techiedelight.com/find-minimum-cost-reach-last-cell-matrix-first-cell/ */

public class MinCostPathMatrix {
    /* global cache variable for solutions */
    private static int[][] CACHE = new int[100][100];

    private static int[][] cost = {
                    { 4, 7, 8, 6, 4 },
                    { 6, 7, 3, 9, 2 },
                    { 3, 8, 1, 2, 4 },
                    { 7, 1, 7, 3, 7 },
                    { 2, 9, 8, 9, 3 }
    };

    public static void main(String[] args) {
       // System.out.println(minCostRecursive(4,4));
       // System.out.println(minCostMemo(4,4));
        System.out.println(minCostDP(4,4));
    }


    /* 36 */
    /* Top-Down approach */
    private static int minCostRecursive(int row, int col) {
        /* stopping condition */
        if (row == 0 && col == 0) // first cell;
            return cost[0][0];
        if (row == 0) // first row;
            return minCostRecursive(0,col-1) + cost[row][col];
        if (col == 0) // first column;
            return minCostRecursive(row-1,0) + cost[row][col];

        /**/
        int left = minCostRecursive(row - 1, col);
        int top = minCostRecursive(row, col - 1);
        return Math.min(left, top) + cost[row][col];
    }


    /* Top-Down approach with cache */
    private static int minCostMemo(int row, int col) {
        /* cache check */
        /* replace every return with cache fill , in end return cache[row][col]*/

        if (CACHE[row][col] != 0)
            return CACHE[row][col];

        /* stopping condition */
        if (row == 0 && col == 0) // first cell;
            CACHE[row][col] = cost[0][0];
        if (row == 0) // first row;
            CACHE[row][col] = minCostRecursive(0,col-1) + cost[row][col];
        if (col == 0) // first column;
            CACHE[row][col] = minCostRecursive(row-1,0) + cost[row][col];

        /* recurrence relation*/
        int left = minCostRecursive(row - 1, col);
        int top = minCostRecursive(row, col - 1);
        CACHE[row][col] = Math.min(left, top) + cost[row][col];

        return CACHE[row][col];
    }


    /* Bottom-up approach */
    private static int minCostDP(int row, int col) {

        /*############## INITIALIZER #################*/
        CACHE[0][0] = cost[0][0];

        /* fill first row */
        for (int i = 1; i <= col; i++) {
            CACHE[0][i] = CACHE[0][i-1] + cost[0][i];
        }

        /* fill first column */
        for (int j = 1; j <= row; j++) {
            CACHE[j][0] = CACHE[j-1][0] + cost[j][0];
        }

        /*#############################################*/



        /* ######### BOTTOM-UP SHIT #############*/
        /* iterate rest of the matrix to fill */
        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {
                int fromTop = CACHE[r-1][c];
                int fromLeft = CACHE[r][c-1];
                CACHE[r][c] = Math.min(fromTop,fromLeft) + cost[r][c];
            }
        }

        return CACHE[row][col];
    }
}