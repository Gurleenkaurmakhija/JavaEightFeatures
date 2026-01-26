package com.gevernova.day1.virtualclassroom;

import java.util.HashMap;

public class Assignment {

    String title;
    HashMap<Student, Integer> grades = new HashMap<>(); // stores students and their marks

    Assignment(String title) {
        this.title = title;
    }

    void submitAssignment(Student s) {
        grades.put(s, null); // marks not assigned yet
    }

    void gradeAssignment(Student s, int marks) {
        grades.put(s, marks);
    }
}
