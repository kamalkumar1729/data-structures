package dp;

public class Stations {
    static int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] costMatrix = {
                {0, 15, 80, 90},
                {INF, 0, 40, 50},
                {INF, INF, 0, 70},
                {INF, INF, INF, 0}
        };
        System.out.println(findCostRecursively(costMatrix,0,3));
    }


    private static int findCostRecursively(int[][] costMatrix, int src, int dest) {
        if (src==dest || src+1 == dest) {
            return costMatrix[src][dest];
        }
        int minCost = costMatrix[src][dest];
        for (int i=src+1; i<dest; i++) {
            int thisCost = findCostRecursively(costMatrix, src, i) + findCostRecursively(costMatrix, i, dest);
            if (thisCost < minCost) {
                minCost = thisCost;
            }
        }
        return minCost;
    }
}
