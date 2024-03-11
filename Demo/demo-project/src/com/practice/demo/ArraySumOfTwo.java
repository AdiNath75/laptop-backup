package com.practice.demo;

public class ArraySumOfTwo {
public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		int sum = 10;
		int[] arr1 = sumToFound(arr, sum);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}


	static int[] sumToFound(int[] arr, int sum) {
		int ar[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == sum) {
					ar[0] = arr[i];
					ar[1] = arr[j];
				}
			}
		}
		return ar;
		
	}


}
