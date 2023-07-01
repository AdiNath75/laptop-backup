package leetcodes;

import java.util.Scanner;

public class StringDivBy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		long num = 0;
		for(int i=0;i<str.length();i++) {
			num = (num * 10) + (str.charAt(i)-48);
		}
		System.out.println(num);
		if(num % 7 == 0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		sc.close();
	}
	public static int isdivisible7(String num){
        int t[]= {1, 3, 2, -1, -3, -2};
		 int p=0;
		 int sum =0;
		 for(int i=num.length()-1;i>=0;i--)
		         sum+=(num.charAt(i)-'0')*t[p++%6];
		 return (sum%7) == 0?1:0; 
	
  }

}
