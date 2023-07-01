package com.practice.demo;

public class FIndNonDuplicate {
	
	public static void main(String[] args) {
		
		int[] arr = {2,5,2,5,1,0,6,8,6,0,8};
		
		int num = findNonDuplicate(arr);
		System.out.println(num);
	}

	private static int findNonDuplicate(int[] arr) {
		
		int num = 0;
		for (int i = 0; i < arr.length-1; i++) {
			int count = 0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count == 0) {
				num = arr[i];
			}
		}
		return num;
	}
	
	

}
