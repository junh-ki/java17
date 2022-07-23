package com.example.java17.features;

public class RaggedArrays {

    private static final int NMAX = 10;

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        int[][] odds = new int[NMAX + 1][];
        for (int i = 0; i <= NMAX; i++) {
            odds[i] = new int[i + 1];
        }
        for (int i = 0; i < odds.length; i++) {
            for (int j = 0; j < odds[i].length; j++) {
                int lotteryOdds = 1;
                for (int k = 1; k <= j; k++) {
                    lotteryOdds = lotteryOdds * (i - k + 1) / k;
                }
                odds[i][j] = lotteryOdds;
            }
        }
        for (int[] row : odds) {
            for (int odd : row) {
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }
    }

}
