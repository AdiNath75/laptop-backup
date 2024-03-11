package com.array.two;

import java.util.Scanner;

public class PrintUserInput {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr = {{1,2},{3,4,5},{6,7,8,9},{0}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
			System.out.println();
			}
			
		}

}
