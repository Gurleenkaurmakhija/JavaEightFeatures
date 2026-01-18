package com.gevernova.day3.methodrefernce.Calculator;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
class MathOperations {
    static int add(int a, int b) { return a + b; }
    static int subtract(int a, int b) { return a - b; }
    static int multiply(int a, int b) { return a * b; }
    static int divide(int a, int b) { return a / b; }
}
public class Main {
    public static void main(String[] args) {

        Calculator add = MathOperations::add;
        Calculator sub = MathOperations::subtract;
        Calculator mul = MathOperations::multiply;
        Calculator div = MathOperations::divide;

        System.out.println("Add: " + add.calculate(10, 5));
        System.out.println("Subtract: " + sub.calculate(10, 5));
        System.out.println("Multiply: " + mul.calculate(10, 5));
        System.out.println("Divide: " + div.calculate(10, 5));
    }
}

