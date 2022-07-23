package com.example.java17.features.records;

import java.util.Objects;

public class Employee {

    private final int employNumber;
    private final String name;

    public Employee(int employNumber, String name) {
        this.employNumber = employNumber;
        this.name = name;
    }

    public int getEmployNumber() {
        return this.employNumber;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employNumber=" + this.employNumber +
                ", name=" + this.name + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return this.employNumber == employee.employNumber && this.name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employNumber, name);
    }

}
