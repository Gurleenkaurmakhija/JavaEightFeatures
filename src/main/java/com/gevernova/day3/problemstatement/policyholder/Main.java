package com.gevernova.day3.problemstatement.policyholder;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PolicyHolder> holders = List.of(
                new PolicyHolder(1, "Amit", 65, "Life", 50000),
                new PolicyHolder(2, "Riya", 45, "Health", 30000),
                new PolicyHolder(3, "John", 70, "Life", 80000),
                new PolicyHolder(4, "Meena", 62, "Life", 20000)
        );

        holders.stream()
                .filter(p -> p.policyType.equals("Life") && p.age > 60)
                .map(p -> {
                    double riskScore = p.premiumAmount / p.age;
                    String category = riskScore > 0.5 ? "High Risk" : "Low Risk";
                    return new RiskAssessment(p.holderId, p.name, riskScore, category);
                })
                .sorted((a, b) -> Double.compare(b.riskScore, a.riskScore))
                .forEach(r -> System.out.println(
                        r.name + " | Score: " + r.riskScore + " | " + r.category
                ));
    }
}

