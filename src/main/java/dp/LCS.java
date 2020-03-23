package dp;

/* Sub Sequence = Not necessarily continuous */
public class LCS {

    private static int[][] SOLUTION = new int[100][100];

    private static int calls = 0;

    public static void main(String[] args) {
        char[] A = "KAMAL".toCharArray();
        char[] B = "KUMAR".toCharArray();

        //System.out.println(LCSRec(A,B,A.length,B.length));
        //System.out.println(LCSMemo(A,B,A.length,B.length));
        System.out.println(LCSDP(A,B,A.length,B.length));
        //System.out.println(calls);

    }

    private static int LCSRec(char[] A, char[] B, int m, int n) {
        if (m == 0 || n==0)
            return 0;
        /*if last character matches */
        if (A[m-1] == B[n-1])
            return 1 + LCSRec(A,B,m-1,n-1);
        else
            return Math.max(LCSRec(A,B,m-1,n), LCSRec(A,B,m,n-1));

    }

    private static int LCSMemo(char[] A, char[] B, int m, int n) {
       calls++;
        if (m == 0 || n==0)
            return 0;
        if (SOLUTION[m-1][n-1] != 0)
            return SOLUTION[m-1][n-1];
        /*if last character matches */
        if (A[m-1] == B[n-1]) {
            SOLUTION[m-1][n-1] = 1 + LCSMemo(A, B, m - 1, n - 1);
            return SOLUTION[m-1][n-1];
        } else {
            SOLUTION[m-1][n-1] = Math.max(LCSMemo(A, B, m - 1, n), LCSMemo(A, B, m, n - 1));
            return SOLUTION[m-1][n-1];
        }
    }


    private static int LCSDP(char[] A, char[] B, int m, int n) {
        /* initialization */
        /* again its filling tha matrix only*/
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n ; j++) {
                if (i == 0 || j == 0)
                    SOLUTION[i][j] = 0;
                else if (A[i-1] == B[j-1])
                    SOLUTION[i][j] = 1 + SOLUTION[i-1][j-1];
                else
                    SOLUTION[i][j] = Math.max(SOLUTION[i-1][j],SOLUTION[i][j-1]);
            }
        }
        return SOLUTION[m][n];
    }
}
