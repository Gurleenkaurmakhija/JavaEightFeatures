//uc2
package com.gevernova.day3.methodrefernce.name;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Person p=new Person();
        List<Person>list1= new ArrayList<>();
        list1.add(new Person("Ram"));
        list1.add(new Person("Sam"));
        list1.add(new Person("Naam"));

        list1.forEach(Person::getName);


        //list1.forEach(p::getName(p));

    }
}
