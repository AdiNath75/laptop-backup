package assesment;

import java.util.Scanner;

public class Code1 {
	public static void main(String[] args) {
		int min = -10000;
		int max = 10000;
		Scanner sc  = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i=0;i<arr.length;i++) {
			int a = sc.nextInt();
			if(a>=min && a<=max) {
				arr[i] =a;
			}
		}
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%3 == 0) {
				count++;
			}
		}
		int[] ar = new int[count];
		for (int i = 0; i < ar.length; i++) {
			if(arr[i]%3==0) {
				ar[i] = arr[i];
			}
		}
		int max1 = 0;
		for (int i=0;i<ar.length ;i++ )
		{
			if (arr[i]>max1)
			{
				max1 = ar[i];
			}
		}
		System.out.println(max1);
	}

}
