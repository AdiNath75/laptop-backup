package com.gfg;

import java.util.ArrayList;

public class SubArrayWithSum {
	public static void main(String[] args) {
		int[] arr = {1,2,3,7,5};
		int n = 5, s = 12;
		ArrayList<Integer> a = new ArrayList<>();
		a = subarraySum(arr, n, s);
		System.out.println(a);
	}
	 static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	    {
	        ArrayList<Integer> l1 = new ArrayList<Integer>();
	        int sum = 0;int i;
	        for(i=0;i<arr.length;i++){
	            for(int j=i;j<arr.length;j++){
	                sum = sum + arr[j];
	                System.out.println(sum);
	                if(sum==s){
	                    l1.add(i+1);
	                    l1.add(j+1);
	                    break;
	                }
	            }
	            if(sum == s) {
	            	break;
	            }
	            sum = 0;
	        }
	        if(i==arr.length){
	            l1.add(-1);
	        }
	        return l1;
	        
	    }

	
}
