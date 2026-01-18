package com.gevernova.day3.problemstatement.employeedata;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Aman", "Engineering", 90000),
                new Employee(2, "Neha", "HR", 60000),
                new Employee(3, "Ravi", "Engineering", 85000),
                new Employee(4, "Pooja", "Engineering", 75000),
                new Employee(5, "Karan", "Sales", 70000)
        );

        // 1. Filter
        List<Employee> filtered = employees.stream()
                .filter(e -> e.getDepartment().equals("Engineering"))
                .filter(e -> e.getSalary() > 80000)
                .collect(Collectors.toList());

        // 2. Sort (descending salary)
        filtered.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        System.out.println("Filtered & Sorted Employees:");
        filtered.forEach(System.out::println);

        // 3. Group by department
        Map<String, List<Employee>> grouped =
                employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("\nGrouped Employees:");
        grouped.forEach((k, v) -> System.out.println(k + " -> " + v));

        // 4. Average salary per department
        Map<String, Double> avgSalary =
                employees.stream().collect(
                        Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        )
                );

        System.out.println("\nAverage Salary:");
        avgSalary.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
