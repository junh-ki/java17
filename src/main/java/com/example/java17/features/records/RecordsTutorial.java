package com.example.java17.features.records;

public class RecordsTutorial {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Employee employee = new Employee(12345, "James");
        System.out.println(employee.getName());
        System.out.println(employee.getEmployNumber());
        System.out.println(employee);

        /**
         * a record is a certain special type of class
         * automatically generated constructor when you create a record is called:
         * "Canonical Constructor"
         * doesn't generate setter methods
         * immutable by default -> once created it cannot be changed
         * having static fields are allowed
         * having non-static instance fields are not allowed
         * cannot extend any other class (no extends clause allowed for record)
         * records are implicitly final classes -> cannot be extended by any other classes
         * allowed to implement interfaces
         * you are allowed to define your own constructor with the exact same parameters and order
         *  to those of the canonical one == override the canonical constructor just to do value validations
         *
         *  can be done by compact constructor (parameters can be skipped in writing
         *  just conditions you want to implement should be there)
         *
         */
        EmployeeRecord employeeRecord = new EmployeeRecord(23456, "Will");
        System.out.println(employeeRecord.name());
        System.out.println(employeeRecord.employeeNumber());
        System.out.println(employeeRecord);
        System.out.println(employeeRecord.nameInUpperCase());
        EmployeeRecord.printWhatever();
    }

}
