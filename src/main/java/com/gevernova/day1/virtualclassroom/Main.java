package com.gevernova.day1.virtualclassroom;


public class Main {

    public static void main(String[] args) {

        // create instructors
        Instructor instructor1 = new Instructor(1, "Dr. Sharma");
        Instructor instructor2 = new Instructor(1, "Dr. Mehta");

        // create courses
        Course course = new Course("Java", instructor1);
        Course course2 = new Course("DSA", instructor2);
        // create students
        Student s1 = new Student(101, "Aman");
        Student s2 = new Student(102, "Neha");

        // enroll students
        course.enroll(s1);
        course.enroll(s2);
        course2.enroll(s1);

        // create assignments
        Assignment a1 = new Assignment("Collection");
        Assignment a2 = new Assignment("Stack");

        // add assignments to courses
        course.addAssignemnt(a1);
        course2.addAssignemnt(a2);

        // submit assignments
        a1.submitAssignment(s1);
        a1.submitAssignment(s2);
        a2.submitAssignment(s1);

        // grade assignments
        a2.gradeAssignment(s1, 88);
        a1.gradeAssignment(s1, 90);
        a1.gradeAssignment(s2, 75);

        // display grades
        System.out.println("\nGrades");
        System.out.println(s1.name + " in " + course.courseName + ": " + a1.grades.get(s1));
        System.out.println(s2.name + " in " + course.courseName + ": " + a1.grades.get(s2));
        System.out.println(s1.name + " in " + course2.courseName + ": " + a2.grades.get(s1));
    }
}
