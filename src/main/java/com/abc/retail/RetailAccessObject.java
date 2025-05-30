package com.abc.retail;

public interface RetailAccessObject {
   String getProductById(String productId);
   void addProduct(String productId, String productName);
}
