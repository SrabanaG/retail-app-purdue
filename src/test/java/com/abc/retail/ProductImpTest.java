package com.abc.retail;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductImpTest {

   @Test
   public void testAddAndGetProduct() {
	RetailAccessObject dao = new RetailDataImp();
	dao.addProduct("101", "Shirt");
	String result = dao.getProductById("101");
	assertEquals("Shirt", result);
   }

   @Test
   public void testProductNotFound() {
	RetailAccessObject dao = new RetailDataImp();
	String result = dao.getProductById("999");
	assertEquals("Product not found", result);
   }
}
