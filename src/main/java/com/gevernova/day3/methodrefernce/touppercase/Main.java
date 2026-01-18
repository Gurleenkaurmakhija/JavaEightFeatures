package com.gevernova.day3.methodrefernce.touppercase;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry");

        words.stream()
                .map(String::toUpperCase)   // method reference
                .forEach(System.out::println); // method reference
    }
}
