package com.practice.whitebelt;



public class HighestScore {
	
	public static void main(String[] args) {
		int num = 9;
		String st = "AAAABBBBB";
		solution(num, st);
	}
	
	public static void solution(int n, String st) {
		String arr[] = {"ABC","BABC","CCAABB"};
		String[] names = {"Amar", "Akbar", "Anthony"};
		int[] max = new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			if(n > arr[i].length()) {
				arr[i] = match(arr[i], n);
				int len = n > arr[i].length() ? arr[i].length() : n;
				max[i] = findMax(arr[i],len,st);
			}else {
				int len = n > arr[i].length() ? arr[i].length() : n;
				max[i] = findMax(arr[i],len, st);
			}
		}
		int large = max[0];
		int temp = 0;
		for(int i=1;i<max.length;i++) {
			 if(max[i] > large) {
				 large = max[i];
				 temp = i;
			 }
		}
		for(int i=0;i<max.length;i++) {
			if(max[temp] == max[i]) {
				System.out.println(names[i]);
				
			}
		}
	}
	
	private static int findMax(String str, int len, String st) {
		int count = 0;
		for(int i=0;i<len;i++) {
			if(str.charAt(i) == st.charAt(i)) {
				count++;
			}
		}
		return count;
		
	}

	public static String match(String st, int n) {
		for(int i=0;i<n;i++) {
			if(st.length() < n) {
				st += st;
			}
		}
		return st;
	}

}
