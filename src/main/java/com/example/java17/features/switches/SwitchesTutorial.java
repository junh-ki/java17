package com.example.java17.features.switches;

public class SwitchesTutorial {

    enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE
    }

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        int numLetters = switch ("Spring") {
            case "Spring", "Summer", "Winter" -> 6;
            case "Fall" -> 4;
            default -> -1;
        };
        System.out.println(numLetters);
        Size itemSize = Size.MEDIUM;
        String label = switch (itemSize) {
            case SMALL -> "S";
            case MEDIUM -> "M";
            case LARGE -> "L";
            case EXTRA_LARGE -> "XL";
        };
        System.out.println(label);

        // No Fallthrough 1
        String seasonName = "Spring";
        int numLetters1 = switch (seasonName) {
            case "Spring" -> {
                System.out.println("spring time!");
                yield 6;
            }
            case "Summer", "Winter" -> 6;
            case "Fall" -> 4;
            default -> -1;
        };
        System.out.println("numLetters1: " + numLetters1);

        // No Fallthrough 2
        int numLetters2;
        switch (seasonName) {
            case "Spring" -> {
                System.out.println("spring time!");
                numLetters2 = 6;
            }
            case "Summer", "Winter" -> numLetters2 = 6;
            case "Fall" -> numLetters2 = 4;
            default -> numLetters2 = -1;
        }
        System.out.println("numLetters2: " + numLetters2);

        // Fallthrough 1
        int numLetters3 = switch (seasonName) {
            case "Spring":
                System.out.println("spring time!");
            case "Summer", "Winter":
                yield 6;
            case "Fall":
                yield 4;
            default:
                yield -1;
        };
        System.out.println("numLetters3: " + numLetters3);

        // Fallthrough 2
        int numLetters4;
        switch (seasonName) {
            case "Spring":
                System.out.println("spring time!");
            case "Summer", "Winter":
                numLetters4 = 6;
                break;
            case "Fall":
                numLetters4 = 4;
                break;
            default:
                numLetters4 = -1;
        }
        System.out.println("numLetters4: " + numLetters4);
    }

}
