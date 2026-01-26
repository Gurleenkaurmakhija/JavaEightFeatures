package com.gevernova.day3.methodrefernce.Calculator;

public class Main {

    public static void main(String[] args) {

        // method references for operations
        Calculator add = MathOperations::add;
        Calculator sub = MathOperations::subtract;
        Calculator mul = MathOperations::multiply;
        Calculator div = MathOperations::divide;

        // perform calculations
        System.out.println("Add: " + add.calculate(10, 5));
        System.out.println("Subtract: " + sub.calculate(10, 5));
        System.out.println("Multiply: " + mul.calculate(10, 5));
        System.out.println("Divide: " + div.calculate(10, 5));
    }
}


