package com.gevernova.day3.problemstatement.productsales;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Sale> sales = Arrays.asList(
                new Sale(101, 15, 100),
                new Sale(102, 5, 200),
                new Sale(103, 20, 150),
                new Sale(104, 12, 300),
                new Sale(105, 18, 250)
        );

        List<ProductSales> result = sales.stream()
                .filter(s -> s.getQuantity() > 10)
                .map(s -> new ProductSales(
                        s.getProductId(),
                        s.getQuantity() * s.getPrice()
                ))
                .sorted((p1, p2) ->
                        Double.compare(p2.getTotalRevenue(), p1.getTotalRevenue()))
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Top Products:");
        result.forEach(System.out::println);
    }
}

