package first.ds.dp;


public class TotalPathsMatrix {

    private static int[][] SOL = new int[100][100];

    private static int totalCalls = 0;

    public static void main(String[] args) {
        //System.out.println(totalPathsRec(4,4));
        //System.out.println(totalPathsMemo(4,4));
        System.out.println(totalPathsDP(4,4));

        System.out.println(totalCalls);
    }

    private static int totalPathsRec(int row, int col) {
        /* only one way to reach any cell in first row/column */
        totalCalls++;
        if (row==1 || col==1)
            return 1;
        /* sum of all tha paths to reach top and left cells */
        /* add diagonal also if diagonal moves allowed */
        return totalPathsRec(row-1,col) + totalPathsRec(row,col-1);
    }

    private static int totalPathsMemo(int row, int col) {
        /*check in SOL*/
        if (SOL[row][col] != 0)
            return SOL[row][col];
        totalCalls++;
        /* only one way to reach any cell in first row/column */
        if (row==1 || col==1)
            return 1;
        /* sum of all tha paths to reach top and left cells */
        /* add diagonal also if diagonal moves allowed */
        SOL[row][col] = totalPathsMemo(row-1,col) + totalPathsMemo(row,col-1);
        return SOL[row][col];
    }



    private static int totalPathsDP(int row, int col) {
        /* fill the first column*/
        for (int i = 0; i < row; i++) {
            SOL[i][0] = 1;
        }

        /*fill the first row*/
        for (int j = 0; j < col; j++) {
            SOL[0][j] = 1;
        }

        /*fill rest fo the matrix*/
        /* totalPaths(anyCell) = totalPaths(topCell) + totalPaths(rightCell)*/
        /* add diagonal also if diagonal moves allowed */
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                SOL[i][j] = SOL[i-1][j]+SOL[i][j-1];
            }
        }
        // (4,4)
        return SOL[row-1][col-1];
    }

}
