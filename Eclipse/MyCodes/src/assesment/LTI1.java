package assesment;

import java.util.Scanner;

public class LTI1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int n = in.nextInt();
		int[] arr = {25,77,54,81,48,34};
		
		int ans = isSqurt(arr);
		System.out.println(ans);
	}
	public static int isSqurt(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j=1;j<max;j++) {
				if((j*j)==arr[i]) {
					count++;
				}
				else if((i*i)>=max) {
					return count;
				}
			}
		}
		return count;
	}

}
