package com.js.product;

public class UpdateProduct {
public static void main(String[] args) {
		
		Product p = new Product();
		p.setName("pen");
		p.setBrand("cello");
		p.setPrice(5);
		p.setQuantity(15);
		
		ProductCRUD pc = new ProductCRUD();
		pc.updateProduct(1, p);
	}
}
