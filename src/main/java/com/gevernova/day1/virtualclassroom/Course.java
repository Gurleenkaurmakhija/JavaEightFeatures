package com.gevernova.day1.virtualclassroom;

import java.util.ArrayList;

public class Course {
    String courseName;
    Instructor instructor;
    ArrayList<Assignment> assignments = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName, Instructor instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    void enroll(Student s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + courseName);
    }

    void addAssignemnt(Assignment a) {
        assignments.add(a);
        System.out.println("assignemnet added " + a.title);
    }
}
