package com.coder;

public class ArrayChall {
	public static void main(String[] args) {
		int [] arr = {0,-2,-2,5,5,5};   
        int count =0;
        for(int i = 0; i < arr.length-1; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    count++;
                arr[i] = -123;
            }  
        }  
        System.out.println(count);
    }  
	

}
