package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product implements Comparable<Product>  {
    private long id;
    private int rating;
    private String name;
    private String category;
    private int price;
    private boolean inStock;

    @Override
    public int compareTo(Product o) {
        return price - o.price;
    }
}
