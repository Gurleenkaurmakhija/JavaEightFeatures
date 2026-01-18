package com.gevernova.day3.methodrefernce.Square;

import java.util.ArrayList;
import java.util.List;


//uc1
public class toSquare {
    public static void Square(int n){
        System.out.println(n*n);
    }
    public static void main(String[] args) {

        List<Integer>list1=new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("Using static method reference");
        list1.forEach(toSquare::Square);


        //list1.stream().map(s->s*s).forEach(System.out::println);
    }

}

