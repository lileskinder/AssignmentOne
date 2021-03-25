package com.MPPCourse;

public class Person {
    String name;
    String phone;
    int age;
    double salary;
    String type;

    public Person(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.type = "Person";
    }

    public String getType() {
        return this.type;
    }

}
