package com.practice.demo;

import java.util.Arrays;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String[] arr = {"apple","apex","apend", "app"};
		
		String ans = commonPrefix(arr);
		mostCommonPrefix(arr);
		System.out.println(ans);
	}

	private static String commonPrefix(String[] a) {
		 int size = a.length;
		 
	        /* if size is 0, return empty string */
	        if (size == 0)
	            return "";
	 
	        if (size == 1)
	            return a[0];
	 
	        /* sort the array of strings */
	        Arrays.sort(a);
	 
	        /* find the minimum length from first and last string */
	        int end = Math.min(a[0].length(), a[size-1].length());
	 
	        /* find the common prefix between the first and
	           last string */
	        int i = 0;
	        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) ) {
	            i++;
	        }
	 
	        String pre = a[0].substring(0, i);
	        
	        return pre;
	}
	
	static void mostCommonPrefix(String[] arr) {
		int size = arr.length;
		Arrays.sort(arr);
		int min = Math.min(arr[0].length(), arr[size-1].length());
		int j = 0;
		for(int i=0;i<min;i++) {
			if(arr[0].charAt(j) == arr[size-1].charAt(j)) {
				j++;
			}
		}
		System.out.println(arr[0].substring(0, 2));
	}
	
}
