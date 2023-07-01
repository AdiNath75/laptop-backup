package com.js.product;

public class SaveProduct {
	public static void main(String[] args) {
		
		Product p = new Product();
		p.setId(2);
		p.setName("Marker");
		p.setBrand("Camel");
		p.setQuantity(10);
		p.setPrice(20);
		
		ProductCRUD pc = new ProductCRUD();
		pc.saveProduct(p);
		System.out.println("Inserted");
	}

}
