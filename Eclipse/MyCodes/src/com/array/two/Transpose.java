package com.array.two;

public class Transpose {
	public static void main(String[] args) {
		int[][] arr = {
						{1,2,3},
						{4,5,6}
					};
		printArray(arr);
		transposeArray(arr);
	}
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void transposeArray(int[][] arr) {
		int[][] ar = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				ar[j][i]= arr[i][j];
			}
		}
		printArray(ar);
	}
	

}
