package com.MPPCourse;

public class Staff extends Person {
    private double salary;
    private String type;

    public Staff(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;
        this.type = "Staff";
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
