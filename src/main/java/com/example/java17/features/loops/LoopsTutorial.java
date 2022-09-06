package com.example.java17.features.loops;

public class LoopsTutorial {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        int count = 0;
        int result = 0;
        read_data: // <- label for the loop below
        while (count < 10) {
            for (int i = 0; i < 10; i++) {
                result++;
                if (result == 9) {
                    System.out.println("Exiting because the result value is 9!");
                    break read_data;
                }
            }
            count++;
        }
    }

}
