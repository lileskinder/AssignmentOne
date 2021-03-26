package com.MPPCourse;

import java.util.List;

public class Course {
    private String number;
    private String title;
    private int units;

    public Course(String number, String title, int units) {
        this.number = number;
        this.title = title;
        this.units = units;
//        this.person = person;
    }

    public int getUnits() {
        return units;
    }

}
