package com.practice.whitebelt;

import java.util.Arrays;

public class LocateTargetIndices {
	
	public static void main(String[] args) {
		int len = 5;
		int num = 2;
		int[] arr = {1,2,5,2,3};
		targetIndices(len,arr, num);
	}

	private static void targetIndices(int len, int[] arr, int num) {
		Arrays.sort(arr);
		int i;int count = 0;
		for(i=0;i<len;i++) {
			if(arr[i] == num) {
				System.out.print(i+" ");
				count++;
			}
		}
		if(count == 0) {
			System.out.println(-1);
		}
	}

	
}
