package com.coder;

import java.util.Scanner;

public class MountBlue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String str = "abc ABC Abc";
		
		
		int ans = sentenseValue(str);
		System.out.println(ans);
		in.close();
	}

	private static int sentenseValue(String str) {
		String st[] = str.split(" ");
		for (int i = 0; i < st.length; i++) {
		}
		int sum1=0,sum2=0;
		for (int i = 0; i < st.length; i++) {
			if(isUpperCase(st[i])) {
				for(int j=0;j<st[i].length();j++) {
					sum1 = sum1 + st[i].charAt(j) - 'A' + 1;
				}
			}
			else {
				for(int k=0;k<st[i].length();k++) {
					if(st[i].charAt(k) >= 'A' && st[i].charAt(k) <= 'Z') {
						sum2 = sum2 + st[i].charAt(k) - 'A' + 1;

					}else if(st[i].charAt(k) >= 'a' && st[i].charAt(k) <= 'z') {
						sum2 = sum2 + st[i].charAt(k) - 'a' + 1;
					}
				}
			}
		}
		return (sum1*2)+sum2;
	}

	private static boolean isUpperCase(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		if(count == str.length()) {
			return true;
		}
		return false;
	}
	

}
