package com.js.product;

import java.util.ArrayList;
import java.util.List;

public class BatchExecution {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setId(4);
		p1.setName("Laptop");
		p1.setBrand("HP");
		p1.setQuantity(17);
		p1.setPrice(50000);
		
		Product p2 = new Product();
		p2.setId(5);
		p2.setName("Mobile");
		p2.setBrand("Nokia");
		p2.setQuantity(8);
		p2.setPrice(15000);
		
		Product p3 = new Product();
		p3.setId(6);
		p3.setName("Earphones");
		p3.setBrand("Boat");
		p3.setQuantity(50);
		p3.setPrice(1000);
		
		List<Product> ps = new ArrayList<>();
		ps.add(p1);
		ps.add(p2);
		ps.add(p3);
		
		ProductCRUD pc = new ProductCRUD();
		pc.batchExecution(ps);
	}

}
