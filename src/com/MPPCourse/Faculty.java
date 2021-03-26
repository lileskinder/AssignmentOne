package com.MPPCourse;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
    private double salary;

    private String type;
    List<Person> person;
    List<Course> courses;

    public Faculty(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;
        this.type = "Faculty";
        this.person = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    @Override
    public String getType() {
        return this.type;
    }

    public double getSalary() {
        return salary;
    }

    public void addCourse(Course courses){
        this.courses.add(courses);
    }

    public int getTotalUnits() {
        int totalUnit = 0;
        for (Course course: courses) {
            totalUnit += course.getUnits();
        }
        return totalUnit;
    }
}
