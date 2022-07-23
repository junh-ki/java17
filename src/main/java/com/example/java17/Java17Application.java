package com.example.java17;

import com.example.java17.features.RaggedArrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java17Application {

    public static void main(String[] args) {
        SpringApplication.run(Java17Application.class, args);
        RaggedArrays.main(new String[0]);
    }

}
