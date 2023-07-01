package array2d;

import java.util.Scanner;

public class DynamicArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = in.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();

		}
	}

}
