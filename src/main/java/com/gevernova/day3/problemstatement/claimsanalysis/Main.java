package com.gevernova.day3.problemstatement.claimsanalysis;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Claim> claims = List.of(
                new Claim(1, "P101", 8000, "2024-01-10", "Approved"),
                new Claim(2, "P102", 3000, "2024-01-12", "Rejected"),
                new Claim(3, "P101", 12000, "2024-01-15", "Approved"),
                new Claim(4, "P103", 15000, "2024-01-20", "Approved"),
                new Claim(5, "P102", 9000, "2024-01-25", "Approved")
        );

        // Filter + Group + Aggregate
        Map<String, DoubleSummaryStatistics> stats =
                claims.stream()
                        .filter(c -> c.status.equals("Approved") && c.claimAmount > 5000)
                        .collect(Collectors.groupingBy(
                                c -> c.policyNumber,
                                Collectors.summarizingDouble(c -> c.claimAmount)
                        ));

        // Top 3 policies by total claim amount
        stats.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue().getSum(), a.getValue().getSum()))
                .limit(3)
                .forEach(e -> System.out.println(
                        "Policy: " + e.getKey() +
                                ", Total: " + e.getValue().getSum() +
                                ", Avg: " + e.getValue().getAverage()
                ));
    }
}
