package myprograms;

import java.util.*;
public class HexaToDec {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			String str = sc.nextLine();
			int res = hexaToDec(str);
			System.out.println(res);
		}
	}
	public static int pow(int n,int p)
	{
		int pow = 1;
		for(int i=p;i>0;i--)
		{
			pow = pow*n;
		}
		return pow;
	}
		public static int hexaToDec(String str)
		{
			int len = str.length();
			int j=0,dec=0;
			for (int i=len-1;i>=0;i--)
			{
					if(str.charAt(i)>='0' && str.charAt(i)<='9')
					{
						dec = dec+((str.charAt(i)-48)*pow(16,j));
						j++;
					}
					else if(str.charAt(i)>='A' && str.charAt(i)<='F')
					{
						dec = dec+((str.charAt(i)-55)*pow(16,j));
						j++;
					}
					
			}
			return dec;
			
		}
	}

