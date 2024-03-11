package com.gfg;
import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int n = 5;
		int arr[] = {1,2,3,5};
		Arrays.sort(arr);
		
		for(int i=arr[0];i<arr[arr.length-1]-arr[0];i++) {
			if(i+1!=arr[i]) {
				System.out.println(i+1+" "+arr[0]);
			}
		}	
	}

}
