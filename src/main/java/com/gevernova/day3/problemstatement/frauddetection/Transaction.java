package com.gevernova.day3.problemstatement.frauddetection;

class Transaction {
    int transactionId;
    String policyNumber;
    double amount;
    String transactionDate;
    boolean isFraudulent;

    Transaction(int transactionId, String policyNumber, double amount, String transactionDate, boolean isFraudulent) {
        this.transactionId = transactionId;
        this.policyNumber = policyNumber;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.isFraudulent = isFraudulent;
    }
}

