package com.MPPCourse;

public class Student extends Person {
    private double gpa;
    private String type;

    public Student(String name, String phone, int age, double gpa) {
        super(name, phone, age);
        this.gpa = gpa;
        this.type = "Student";
    }

    @Override
    public String getType() {
        return this.type;
    }
}
