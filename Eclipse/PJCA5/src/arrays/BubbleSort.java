package arrays;

import java.util.Scanner;

public class BubbleSort {
		
		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements to be entered");
		
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" elemrnts");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt(); 
		}
		a = bubbleSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static int[] bubbleSort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		return a;
	}
}

