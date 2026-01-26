package com.gevernova.day3.methodrefernce.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//uc3
public class Main {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Banana", "apple", "Orange");

        // sort strings ignoring case
        Collections.sort(words, String::compareToIgnoreCase);

        System.out.println(words);
    }
}


