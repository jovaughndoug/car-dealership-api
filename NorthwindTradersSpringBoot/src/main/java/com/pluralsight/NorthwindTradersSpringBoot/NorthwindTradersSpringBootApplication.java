package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication implements CommandLineRunner {

    @Autowired
    private SimpleProductDao productDao;

    public static void main(String[] args) {
        SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean looper = true;
        while (looper) {
            System.out.println("""
                    Please Select an option:
                    1.) List Products
                    2.) Add Products
                    3.) Exit
                    """);
            int menuChoice = scanner.nextInt();
            scanner.nextLine();
            switch (menuChoice) {
                case 1 -> {
                    List<Product> products = productDao.getAll();
                    if (products.isEmpty()) {
                        System.out.println(" No Products are Available my guy.");
                    } else {
                        for (Product product : products) {
                            System.out.println(product);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(" Enter Product name");
                    String name = scanner.nextLine();
                    System.out.println("Enter Category");
                    String category = scanner.nextLine();
                    System.out.println(" Enter Price");
                    double price = scanner.nextDouble();
                    Product newProduct = new Product(id, name, category, price);
                    productDao.add(newProduct);
                    System.out.println(" Product Added");
                }
                case 3 -> {
                    looper = false;
                    System.out.println("Bai-Bai");
                }
            }


        }

    }
}

