package assesment;

import java.util.*;
import java.util.Arrays;

public class MakeMeBig {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int n = noOfDig(num);
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = num%10;
			num/=10;
		}
		ar = sortArr(ar);
		String st = "";
		for (int i = 0; i <ar.length; i++) {
			st = st + ar[i];
		}
		System.out.println(st);
	}
	public static int noOfDig(int num)
	{
		int count = 0;
		for (int i=num;i>0 ;i/=10 )
		{
			count++;
		}
		return count;
	}
	public static int[] sortArr(int[] arr) 
	{
		int max1 = 0;
		for (int i=0;i<arr.length ;i++ )
		{
			for (int j=i+1;j<arr.length ;j++ )
			{
				if (arr[i]<arr[j])
				{
					max1 = arr[i];
					arr[i] = arr[j];
					arr[j]= max1;
				}
			}
		}
		return arr;
	}
}
