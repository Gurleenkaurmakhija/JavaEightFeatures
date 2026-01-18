package com.gevernova.day3.problemstatement.bookrecommendation;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Dune", "Frank Herbert", "Science Fiction", 4.5),
                new Book("Foundation", "Asimov", "Science Fiction", 4.2),
                new Book("1984", "Orwell", "Dystopian", 4.6),
                new Book("Hyperion", "Simmons", "Science Fiction", 4.3),
                new Book("Random Book", "X", "Science Fiction", 3.8)
        );

        List<BookRecommendation> recommendations =
                books.stream()
                        .filter(b -> b.getGenre().equals("Science Fiction"))
                        .filter(b -> b.getRating() > 4.0)
                        .map(b -> new BookRecommendation(b.getTitle(), b.getRating()))
                        .sorted((b1, b2) -> Double.compare(b2.toString().length(), b1.toString().length()))
                        .limit(10)
                        .collect(Collectors.toList());

        System.out.println("Recommended Books:");
        recommendations.forEach(System.out::println);
    }
}
