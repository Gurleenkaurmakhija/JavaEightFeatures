package com.gevernova.day3.methodrefernce.sqrt;

import java.util.Arrays;
import java.util.List;
//uc6
public class tosqrt {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 9, 16);

        nums.stream()
                .map(Math::sqrt)
                .forEach(System.out::println);
    }
}
