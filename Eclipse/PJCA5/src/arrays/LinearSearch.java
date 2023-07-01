package arrays;

import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int a[] = {10,20,30,40,50};
			System.out.println("Enter number to be Searched");
			int i;
			int num = sc.nextInt();
			for (i = 0; i < a.length; i++) {
				if(num == a[i])
				{
					System.out.println("Element found at index "+i);
					break;
				}
			}
			if(i==a.length)
			{
				System.out.println("Element not found");
			}
		}
	}
	

}
