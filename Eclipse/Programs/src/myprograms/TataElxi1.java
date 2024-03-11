package myprograms;

import java.util.Scanner;
public class TataElxi1 {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int len = sc.nextInt();
			int arr[] = new int[len];
			for(int i=0;i<arr.length;i++)
			{
				arr[i] = sc.nextInt();
			}
			int sum[] = new int[20];
			int count = 0;
			for (int j=0;j<sum.length;j++)
			{
				for(int i=count;i<arr.length;i++)
				{
					if(arr[i]>0)
					{
						sum[j]=sum[j]+arr[i];
					}
					else
					{
						j++;
					}
				}
			}
			int max = 0;
			for (int i=0;i<sum.length ;i++ )
			{
				if (max<sum[i])
				{
					max=sum[i];
				}
			}
			System.out.println(max);
		}
	}	
}
