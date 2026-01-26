package com.gevernova.day3.methodrefernce.name;

public class Person {
    String name;
    Person(String n){
        this.name=n;
    }

    static void getName(Person p){
         System.out.println(p.name);
    }
}
