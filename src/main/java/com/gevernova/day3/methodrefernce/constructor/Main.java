package com.gevernova.day3.methodrefernce.constructor;

//uc4
interface ShapeCreator {
    Rectangle create(int l, int b);
    //rectangle obj as return type
}

class Rectangle {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println("Area = " + (l * b));
    }
}

public class Main {
    public static void main(String[] args) {
        //constructor refernce
        ShapeCreator creator = Rectangle::new;
        Rectangle r = creator.create(5, 6);
        r.area();
    }
}

