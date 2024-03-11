package myprograms;

import java.util.*;
public class BinToOct {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int dec = BinToDec.binToDec(num);
			String oct = binToOct(dec);
			System.out.println(oct);
		}
	}
	public static String binToOct(int num)
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
