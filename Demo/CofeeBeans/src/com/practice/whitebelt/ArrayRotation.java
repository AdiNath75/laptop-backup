package com.practice.whitebelt;

public class ArrayRotation {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int rota = 3;
		rotateArray(arr, rota);
	}

	private static void rotateArray(int[] arr, int rota) {
		int[] temp = new int[arr.length];
		for(int i=0;i<rota;i++) {
			temp[temp.length-1] = arr[0];
			for (int j = 1; j < arr.length; j++) {
				temp[j-1] = arr[j];
			}
			for (int j = 0; j < temp.length; j++) {
				arr[j] = temp[j];
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
	}
	

}
