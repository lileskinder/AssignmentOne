package com.MPPCourse;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    List<Person> person;
    List<Course> course;
    public Department(String name) {
        this.name = name;
        person = new ArrayList<>();
        course = new ArrayList<>();
    }

    public double getTotalSalary() {
        double totalSalary = 0;

        for(int i = 0; i < person.size(); i++) {
            if(this.person.get(i) instanceof  Faculty) {
                Faculty faculty = (Faculty) this.person.get(i);
                totalSalary += faculty.getSalary();
            }
            else if (this.person.get(i) instanceof Staff) {
                Staff staff = (Staff) this.person.get(i);
                totalSalary += staff.getSalary();
            }
        }

        return totalSalary;
    }

    public void showAllMembers() {
        for (Person p : person)
        {
            System.out.println(p.name + ", "  + p.phone + ", "  + p.age + ", " + p.getType());
        }


    }

    public void unitsPerFaculty() {
        for(int i = 0; i < course.size(); i++) {
            System.out.println(course.get(i).person);
        }
    }

    public void addPerson(Person person) {
        this.person.add(person);
    }

    public void addStaff(Person person) {
        this.person.add(person);
    }

    public void addFaculty(Person person) {
        this.person.add(person);
    }

    public void addStudent(Person person) {
        this.person.add(person);
    }
}
