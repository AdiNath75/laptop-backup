package com.practice.whitebelt;

public class UniqueNumber {
	
	public static void main(String[] args) {
		int len = 7;
		int[] arr = {3,3,5,5,6,8,8};
		solution(arr, len);
	}

	private static void solution(int[] arr, int len) {
		for(int i=0;i<len;i++) {
			if(arr[i] == arr[i+1]) {
				i++;
			}else {
				System.out.println(arr[i]);
			}
		}
	}
	
	

}
