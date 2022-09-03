package com.example.java17.features.strings;

import java.util.Arrays;

public class StringsTutorial {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);

        String repeated = "Java".repeat(3);
        System.out.println(repeated);

        String string1 = "string-string-string";
        int[] codePoints = string1.codePoints().toArray();
        System.out.println(Arrays.toString(codePoints));

        String string2 = new String(codePoints, 0, codePoints.length);
        System.out.println(string2);

        int codePointBeer = 0x1F37A;
        String codePointStr = Character.toString(codePointBeer);
        System.out.println(codePointStr);

        int codePointMiddleFinger = 0x1F595; // 128405
        String middleFinger = Character.toString(codePointMiddleFinger);
        System.out.println(middleFinger);

        String stripString = " test strip ";
        System.out.println(stripString.trim());
        // use strip instead of the archaic trim method that eliminates characters <= U+0020
        System.out.println(stripString.strip());

        // StringBuilder
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append('c');
        strBuilder.append("at");
        String completedString = strBuilder.toString();
        System.out.println(completedString);
        System.out.println(strBuilder.length());

        // Text Blocks
        String greeting = """
                Hello
                World
                !
                """;
        System.out.println(greeting);
        String prompt1 = """
                Hello, my name is Hal.
                Please enter your name: """;
        System.out.println(prompt1);
        String prompt2 = """
                Hello, my name is Hal. \
                Please enter your name: """;
        System.out.println(prompt2);
        String prompt3 = """
                Hello, my name is "Hal". \\
                Please enter your name:\s""";
        System.out.println(prompt3);
        String html = """
                <div class="Warning">
                    Beware of those who say "Hello" to the world.
                </div>
                """;
        System.out.println(html);
    }

}
