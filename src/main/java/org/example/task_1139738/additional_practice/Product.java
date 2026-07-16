package org.example.task_1139738.additional_practice;

import java.util.ArrayList;
import java.util.List;

public class Product {

  private String productName;
  private double price;
  private int productId;

  public Product(int productId, String productName, double price) {
    this.productName = productName;
    this.price = price;
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public double getPrice() {
    return price;
  }

  public int getProductId() {
    return productId;
  }

  @Override
  public String toString() {
    return "Product{" +
        "productName='" + productName + '\'' +
        ", price=" + price +
        ", productId=" + productId +
        '}';
  }
}
