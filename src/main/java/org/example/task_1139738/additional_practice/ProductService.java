package org.example.task_1139738.additional_practice;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

  public double calculateTotalPrice(List<Product> products) {
    double sumPrices = 0;
    for (Product product : products) {
      sumPrices += product.getPrice();
    }
    return sumPrices;
  }

  public List<Product> findExpensiveProducts(List<Product> products) {
    List<Product> expensiveProducts = new ArrayList<>();
    for (Product product : products) {
      if (product.getPrice() > 100) {
        expensiveProducts.add(product);
      }
    }
    return expensiveProducts;
  }
}
