package com.gevernova.day3.methodrefernce.constructor;

public class Main {
    public static void main(String[] args) {

        //constructor refernce
        ShapeCreator creator = Rectangle::new;
        Rectangle r = creator.create(5, 6);
        r.area();
    }
}

