package com.MPPCourse;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    List<Person> personList;
    List<Course> courseList;
    public Department(String name) {
        this.name = name;
        this.personList = new ArrayList<>();
        this.courseList = new ArrayList<>();
    }

    public double getTotalSalary() {
        double totalSalary = 0;

        for(int i = 0; i < personList.size(); i++) {
            if(this.personList.get(i) instanceof  Faculty) {
                Faculty faculty = (Faculty) this.personList.get(i);
                totalSalary += faculty.getSalary();
            }
            else if (this.personList.get(i) instanceof Staff) {
                Staff staff = (Staff) this.personList.get(i);
                totalSalary += staff.getSalary();
            }
        }

        return totalSalary;
    }

    public void showAllMembers() {
        for (Person p : personList)
        {
            System.out.println(p.name + ", "  + p.phone + ", "  + p.age + ", " + p.getType());
        }
    }

    public void unitsPerFaculty() {
        System.out.println("Person-> "+personList.size());
        for(Person person: personList) {
            int unit=0;
            unit+=person.getTotalUnits();

            if(person.getTotalUnits() > 0) {
                System.out.println("This is test");
                System.out.println(person.getName() + ": " + " " + unit + " Units");
            }
        }



    }

    public void addPerson(Person person) {
        this.personList.add(person);
    }

    public void addStaff(Person person) {
        this.personList.add(person);
    }

    public void addFaculty(Person person) {
        this.personList.add(person);
    }

    public void addStudent(Person person) {
        this.personList.add(person);
    }
}
