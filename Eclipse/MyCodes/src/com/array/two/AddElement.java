package com.array.two;

public class AddElement {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},
					   {4,5,6}};
		printArray(arr);
		addElement(arr, 10, 0,1);
	}
	 static void addElement(int[][] arr, int ele, int r, int c) {
		 
		 arr[r][c] = ele;
		 printArray(arr);
		// TODO Auto-generated method stub
		
	}
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
