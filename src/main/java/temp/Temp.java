package temp;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Random;

public class Temp {

    private static final Integer SIZE = 3000;

    public static void main(String[] args) {

        int cores = Runtime.getRuntime().availableProcessors();

        System.out.println(" CORE : " + cores);

        int[][] firstMatrix = new int[SIZE][SIZE];
        int[][] secondMatrix = new int[SIZE][SIZE];

        Random random = new Random();

        System.out.println(" POPULATION SRT " + new Date().toString());

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                firstMatrix[i][j] = random.nextInt(100);
                secondMatrix[i][j] = random.nextInt(100);
            }
        }

        System.out.println(" POPULATION END " + new Date().toString());

        //  System.out.println("fist "+ firstMatrix[55][555]);
        // System.out.println("second " + secondMatrix[55][555]);

        int[][] result = new int[SIZE][SIZE];

        System.out.println();

        System.out.println(" MULTIPLICATION SRT " + new Date().toString());

        Instant start = Instant.now();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int res = 0;
                for (int k = 0; k < j; k++) {
                    res = res + firstMatrix[i][k] * secondMatrix[k][j];
                }
                result[i][j] = res;
            }
        }

        Instant end = Instant.now();

        System.out.println(" MULTIPLICATION END " + new Date().toString());

        System.out.println(" DURATION in seconds " + Duration.between(start, end).getSeconds());

    }
}