package com.gevernova.day3.problemstatement.policyholder;

class PolicyHolder {
    int holderId;
    String name;
    int age;
    String policyType;
    double premiumAmount;

    PolicyHolder(int holderId, String name, int age, String policyType, double premiumAmount) {
        this.holderId = holderId;
        this.name = name;
        this.age = age;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
    }
}

class RiskAssessment {
    int holderId;
    String name;
    double riskScore;
    String category;

    RiskAssessment(int holderId, String name, double riskScore, String category) {
        this.holderId = holderId;
        this.name = name;
        this.riskScore = riskScore;
        this.category = category;
    }
}
