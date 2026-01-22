package com.gevernova.day3.problemstatement.claimsanalysis;

class Claim {
    int claimId;
    String policyNumber;
    double claimAmount;
    String claimDate;
    String status;

    Claim(int claimId, String policyNumber, double claimAmount, String claimDate, String status) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.status = status;
    }
}

