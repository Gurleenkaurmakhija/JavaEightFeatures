package com.gevernova.day3.problemstatement.bookrecommendation;

public class BookRecommendation {
    private String title;
    private double rating;

    public BookRecommendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return title + " (" + rating + ")";
    }
}
