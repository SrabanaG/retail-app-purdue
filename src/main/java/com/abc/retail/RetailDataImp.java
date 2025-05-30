package com.abc.retail;

import java.util.HashMap;
import java.util.Map;

public class RetailDataImp implements RetailAccessObject {
    private Map<String, String> productDatabase = new HashMap<>();

    @Override
    public String getProductById(String productId) {
	return productDatabase.getOrDefault(productId, "Product not found");
    }

    @Override
    public void addProduct(String productId, String productName) {
	productDatabase.put(productId, productName);
    }
} 
