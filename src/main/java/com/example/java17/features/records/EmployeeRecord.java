package com.example.java17.features.records;

public record EmployeeRecord (int employeeNumber, String name) {

    /*
    compact constructor. it will automatically set the fields as it does in the canonical constructor.
     */
    public EmployeeRecord {
        if (employeeNumber <= 0) {
            throw new IllegalArgumentException("employeeNumber cannot be negative.");
        }
    }

    public String nameInUpperCase() {
        return name.toUpperCase();
    }

    public static void printWhatever() {
        System.out.println("whatever");
    }

}
