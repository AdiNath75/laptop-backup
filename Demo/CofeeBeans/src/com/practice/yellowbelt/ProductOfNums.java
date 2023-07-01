package com.practice.yellowbelt;

public class ProductOfNums {
	public static void main(String[] args) {
		int num = 5;
		product(num);
	}

	private static void product(int num) {
		int ans = 1;
		for(int i =1;i<=num;i++) {
			ans = ans * i;
		}
		System.out.println(ans);
	}
}
