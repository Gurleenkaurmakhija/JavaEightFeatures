package com.gevernova.day3.problemstatement.frauddetection;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Transaction> transactions = List.of(
                new Transaction(1, "P101", 15000, "2024-02-01", true),
                new Transaction(2, "P101", 12000, "2024-02-03", true),
                new Transaction(3, "P102", 9000, "2024-02-05", true),
                new Transaction(4, "P101", 20000, "2024-02-07", true),
                new Transaction(5, "P101", 11000, "2024-02-08", true),
                new Transaction(6, "P101", 13000, "2024-02-10", true)
        );

        Map<String, List<Transaction>> fraudMap =
                transactions.stream()
                        .filter(t -> t.isFraudulent && t.amount > 10000)
                        .collect(Collectors.groupingBy(t -> t.policyNumber));

        fraudMap.forEach((policy, txns) -> {
            long count = txns.size();
            double totalAmount = txns.stream().mapToDouble(t -> t.amount).sum();

            if (count > 5 || totalAmount > 50000) {
                System.out.println("ALERT for Policy " + policy +
                        " | Fraud Count: " + count +
                        " | Amount: " + totalAmount);
            }
        });
    }
}
