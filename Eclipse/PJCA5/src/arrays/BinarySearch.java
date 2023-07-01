package arrays;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" elemrnts");
		int start = 0, end = a.length-1, mid = (start+end)/2;
		boolean found = false;
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt(); 
		}
		System.out.println("Enter element to be Searched");
		int key = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if(key == a[mid]) {
				found = true;	
			}
			else if(key < a[mid]) {
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
			mid = (start+end)/2;
		}
		if(found == true)
		{
			System.out.println("Element found at index "+mid);
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}
