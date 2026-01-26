package com.gevernova.day3.methodrefernce.fiilterstring;

import java.util.Arrays;
import java.util.List;

class Filter {

    static boolean hasA(String s) {
        return s.contains("a");
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "kiwi", "banana");

        words.stream()
                .filter(Filter::hasA)
                .forEach(System.out::println);
    }
}

