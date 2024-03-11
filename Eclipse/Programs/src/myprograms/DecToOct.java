package myprograms;

import java.util.*;
public class DecToOct {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			String ans = decToOct(num);
			System.out.println(ans);
		}
		
	}
	public static String decToOct(int num)
	{
		String oct="";
		while(num>0)
		{
			int rem = num%8;
			oct = rem+oct;
			num/=8;
		}
		return oct;
	}

}
