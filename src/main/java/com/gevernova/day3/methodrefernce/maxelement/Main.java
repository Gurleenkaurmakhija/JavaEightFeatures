package com.gevernova.day3.methodrefernce.maxelement;
//uc5

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//uc6
public class Main {

    // finds maximum element using comparator
    static <T> T findMax(List<T> list, Comparator<T> comp) {
        return Collections.max(list, comp);
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 50, 30);

        // method reference for comparison
        Integer max = findMax(nums, Integer::compareTo);
        System.out.println(max);
    }
}

