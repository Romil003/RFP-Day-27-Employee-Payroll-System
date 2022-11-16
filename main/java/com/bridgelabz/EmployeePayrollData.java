package com.bridgelabz;

public class EmployeePayrollData {

    int id;

    String name;

    int salary;

    public EmployeePayrollData() {
    }

    public EmployeePayrollData(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
