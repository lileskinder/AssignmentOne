package com.MPPCourse;

public class Faculty extends Person {
    private double salary;

    private String type;

    public Faculty(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;
        this.type = "Faculty";
    }

    @Override
    public String getType() {
        return this.type;
    }

    public double getSalary() {
        return salary;
    }
}
