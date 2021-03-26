package com.MPPCourse;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    String phone;
    int age;
    double salary;
    String type;
    List<Course> courses;

    public Person(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.type = "Person";
        courses = new ArrayList<>();
    }

    public String getType() {
        return this.type;
    }

    public int getTotalUnits() {
        return 0;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
}
