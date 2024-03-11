package array;

import java.util.Scanner;

public class SecMax {
	
		public static void main(String[] args) 
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Size of an array");
			int n = in.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter "+n+" values");
			for(int i=0;i<arr.length;i++) {
				arr[i] = in.nextInt();
			}
			int max1 = 0;
			for (int i=0;i<arr.length ;i++ )
			{
				for (int j=i+1;j<arr.length ;j++ )
				{
					if (arr[i]>arr[j])
					{
						max1 = arr[i];
						arr[i] = arr[j];
						arr[j]= max1;
					}
				}
			}
			System.out.println(arr[arr.length-1]);
		}
}
