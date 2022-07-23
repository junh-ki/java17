package com.example.java17;

import com.example.java17.features.RaggedArrays;
import com.example.java17.features.records.RecordsTutorial;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java17Application {

    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static void main(String[] args) {
        SpringApplication.run(Java17Application.class, args);
        printClassTestLogOnConsole(RaggedArrays.class.getName());
        RaggedArrays.main(EMPTY_STRING_ARRAY);
        printClassTestLogOnConsole(RecordsTutorial.class.getName());
        RecordsTutorial.main(EMPTY_STRING_ARRAY);
    }

    private static void printClassTestLogOnConsole(String className) {
        System.out.println("---------- " + className + " ----------");
    }

}
