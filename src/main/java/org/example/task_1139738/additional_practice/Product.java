package org.example.task_1139738.additional_practice;

import java.util.ArrayList;
import java.util.List;

public class Product {

  private String productName;
  private double price;

  public Product(String productName, double price) {
    this.productName = productName;
    this.price = price;
  }

  public String getProductName() {
    return productName;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "productName='" + productName + '\'' +
        ", price=" + price +
        '}';
  }
}
