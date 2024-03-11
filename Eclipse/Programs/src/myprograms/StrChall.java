package myprograms;

import java.util.Scanner;

public class StrChall {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String ans = strCh(str);
		
		System.out.println(ans);
	}
	public static String strCh(String str) {
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				st = st + str.charAt(i);
			}	
		}
		System.out.println();
		for(int i=0; i<st.length();) {
			if(st.charAt(i)=='a' && st.charAt(i+3)=='b')
			{
				return "true";
			}
			return "false";		
		}
		return "false";
	}

}
