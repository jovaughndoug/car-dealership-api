package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {
     List<Product> products;

    public SimpleProductDao() {
        products = new ArrayList<>();
        products.add(new Product(1,"Laptop", "Electronics", 1500.00));
        products.add(new Product(2,"PS5", "Entertainment", 500.00));
        products.add(new Product(3,"JBL Speaker", "Audio", 250.00));

    }

    @Override
    public void add(Product product) {
        products.add(product);

    }

    @Override
    public List<Product> getAll() {

        return products;
    }
}
