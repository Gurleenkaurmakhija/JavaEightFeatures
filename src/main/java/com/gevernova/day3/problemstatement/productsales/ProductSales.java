package com.gevernova.day3.problemstatement.productsales;

public class ProductSales {
    private int productId;
    private double totalRevenue;

    public ProductSales(int productId, double totalRevenue) {
        this.productId = productId;
        this.totalRevenue = totalRevenue;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    @Override
    public String toString() {
        return "Product " + productId + " -> Revenue: " + totalRevenue;
    }
}

