package assesment;

import java.util.Scanner;

public class NumPattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		
		System.out.println();
			
			for(int k=i+1;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();

		}
	}
	

}
