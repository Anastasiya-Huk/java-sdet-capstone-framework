package org.example.task_1139738.additional_practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    User petya = new User(1, "Petya", "petya@jhk.com", UserStatus.ACTIVE);
    User katya = new User(2, "Katya", "katya@4jhk.com", UserStatus.ACTIVE);
    User masha = new User(3, "Masha", "masha@4jkhk.com", UserStatus.BLOCKED);
    User maks = new User(4, "", "maks@4jkghk.com", UserStatus.DELETED);

    petya.validate();
    katya.validate();
    masha.validate();
    maks.validate();

    System.out.println(petya + "\n" + katya + "\n" + masha + "\n" + maks);

    ProductService service = new ProductService();

    List<Product> products = new ArrayList<>();
    products.add(new Product("Laptop", 3000));
    products.add(new Product("Earphones", 50.50));
    products.add(new Product("Wrist watch", 200.20));
    products.add(new Product("Phone", 1499));
    products.add(new Product("Keyboard", 20));

    for (Product product : products) {
      System.out.println(product);
    }

    Product mostExpensive = products.get(0);
    for (Product product : products) {
      if (product.getPrice() > mostExpensive.getPrice()) {
        mostExpensive = product;
      }
    }
    System.out.println("Most expensive product: " + mostExpensive);

    double totalPrice = service.calculateTotalPrice(products);
    System.out.println("Total amount: " + totalPrice);

    List<Product> expensiveProducts = service.findExpensiveProducts(products);
    System.out.println("Expensive products: " + expensiveProducts);
  }
}