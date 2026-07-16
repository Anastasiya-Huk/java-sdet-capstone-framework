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

    List<User> users = new ArrayList<User>();
    users.add(petya);
    users.add(katya);
    users.add(masha);
    users.add(maks);

    UserService userService = new UserService();

    User findUser = userService.findUserByEmail(users, "katya@4jhk.com");
    System.out.println("Found user: " + findUser);

    int countUsers = userService.countUserByStatus(users, UserStatus.ACTIVE);
    System.out.println("Number of users by status: " + countUsers);

    ProductService productService = new ProductService();

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

    double totalPrice = productService.calculateTotalPrice(products);
    System.out.println("Total amount: " + totalPrice);

    List<Product> expensiveProducts = productService.findExpensiveProducts(products);
    System.out.println("Expensive products: " + expensiveProducts);
  }
}