package ru.itpark;

import ru.itpark.model.Product;
import ru.itpark.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        service.addAll(
                new Product(1, 5, "Сапоги","Обувь", 4_000, true),
                new Product(2, 4, "Наушники беспроводные", "Компьютеры и ноутбуки ", 2_870, false),
                new Product(3, 3, "мышь Logitech", "Компьютеры и ноутбуки ", 1_000, true),
                new Product(4, 3, "мышь Genius", "Компьютеры и ноутбуки ", 1_900, false));

        List<Product> results = service.searchByName("мышь");
        System.out.println(results);

    }


}
