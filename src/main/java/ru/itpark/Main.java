package ru.itpark;

import ru.itpark.model.Product;
import ru.itpark.service.ProductService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        service.addAll(
                new Product(1, 3, "Сапоги", "Обувь", 6_000, true),
                new Product(2, 5, "Ботинки", "Обувь", 8_000, true),
                new Product(3, 5, "Туфли женские", "Обувь", 7_000, true),
                new Product(4, 4, "Наушники беспроводные Samsung", "Компьютеры и ноутбуки ", 2_890, false),
                new Product(5, 4, "Наушники беспроводные HP", "Компьютеры и ноутбуки ", 1_987, false),
                new Product(6, 2, "мышь Logitech", "Компьютеры и ноутбуки ", 900, true),
                new Product(7, 5, "мышь Genius", "Компьютеры и ноутбуки ", 1_900, false));

        List<Product> results1 = service.searchByName("Ботинки");
        System.out.println(results1);
        List<Product> results2 = service.searchByCategory("Обувь");
        System.out.println(results2);

        System.out.println(service.pageList(results2, 0, 2));


    }


}
