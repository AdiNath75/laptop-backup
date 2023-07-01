package com.practice.yellowbelt;

public class MinimizeDifference {
	
	public static void main(String[] args) {
		int n = 4;
		int[] arr = {1,2,-3,4};
		minimize(arr,n);
	}

	private static void minimize(int[] arr, int n) {
		int[] temp = new int[n];
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				for(int j=0;j<arr.length-1;j++) {
					temp[i] = temp[i] + arr[j];
				}
			}else {
				for (int j = 0; j < arr.length; j++) {
					if(i < j) {
						temp[i] = temp[i] + arr[j];
					}else if(i > j) {
						temp [i] = temp[i] - arr[j];
					}
				}	
			}
		}
		System.out.println();
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
		System.out.println();
		
		int num = 0;
		int min = temp[0];
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] < 0) {
				temp[i] = -temp[i];
			}
			if(temp[i] < min) {
				min = temp[i];
				num = i;
			}
		}
		
		System.out.println(num+1);
		
	}

}
