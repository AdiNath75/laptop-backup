package com.practice.yellowbelt;

import java.util.LinkedList;

public class MaximumSpecialSum {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(1);
		
		System.out.println(list);
		int sum = 0;
		int max = 0;
		for(int i=0;i<list.size()-1;i++) {
			sum = list.get(i) + list.get(i+1);
			if(max < sum){
				max = list.get(i) + list.get(i+1);
			}
		}
		System.out.println(max);
	}

}

