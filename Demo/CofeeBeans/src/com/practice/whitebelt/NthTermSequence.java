package com.practice.whitebelt;

public class NthTermSequence {
	
	public static void main(String[] args) {
		int num = 5;
		System.out.println(solution(num));
		
	}

	private static String solution(int n) {
		if (n == 1)     return "1";
	    if (n == 2)     return "11";
	    
	    String str = "11";
	    for(int i=3;i<=n;i++) {
			str += '$';
			String st = "";
			int len = str.length();
			int count = 1;
			char[] arr = str.toCharArray();
			for(int j=1;j< len;j++) {
				if(arr[j] != arr[j-1]) {
					st += count +0;
					st = st+arr[j-1];
					count = 1;
				}
				else {
					count++;
				}
			}
			str = st;
		}
	    return str;
	}
}
