package com.js.product;

public class DeleteProduct {
		public static void main(String[] args) {
			ProductCRUD pc = new ProductCRUD();
			pc.deleteProduct(4);
			pc.deleteProduct(5);
			pc.deleteProduct(6);
		}
}
