package myprograms;

import java.util.Scanner;
public class Birla1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int arr[] = new int[5];
			int sum = 0;
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = sc.nextInt();
			}
			for(int i=0;i<arr.length;i++)
			{
				sum = sum + arr[i];
				System.out.println(sum);
			}
		}
	}
}
	
