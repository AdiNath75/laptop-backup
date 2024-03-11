package com.practice.yellowbelt;

public class FirstUniqueChar {

	public static void main(String[] args) {
		String str = "love";
		int ans = findUniqueChar(str);
		System.out.println(ans);
	}

	private static int findUniqueChar(String str) {
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				
				if (str.charAt(i) == str.charAt(j) && i != j) {
					count++;
				}
			}
			if (count == 0) {
				return i;
			}
		}
		return -1;
	}

}
