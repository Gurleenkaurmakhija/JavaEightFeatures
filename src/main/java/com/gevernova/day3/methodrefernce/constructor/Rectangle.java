package com.gevernova.day3.methodrefernce.constructor;

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
