package com.example.java17.features.switches;

public class SwitchesTutorial {

    enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE
    };

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
    }

}
