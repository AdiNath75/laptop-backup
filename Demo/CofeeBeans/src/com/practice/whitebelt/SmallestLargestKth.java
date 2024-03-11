package com.practice.whitebelt;

import java.util.Arrays;

public class SmallestLargestKth {
	public static void main(String[] args) {
		int  n = 6;
		int arr[] = {7,10,4,3,20,15};
		int k = 4;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int largest = arr[k-1];
		int smallest = arr[arr.length-k];
		System.out.println(largest+ "  "+smallest);
	}
	
	
	

}
