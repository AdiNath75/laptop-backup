package com.gfg;

import java.util.ArrayList;

public class PrimeSum {
	public static void main(String[] args) {
		int N = 23;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=1;i<N;i++){
            int j;
    		for (j=2;j<i;j++ )
    		{
    			if (i%j==0)
    				break;
    		}
    		if (i==j){
    		    a.add(i);
    		}
        }
        System.out.println(a);
        int temp =0;int i;
        for(i=0;i<a.size();i++){
            for(int j=i+1;j<a.size();j++){
                if(a.get(i)+a.get(j) == N){
                    System.out.println("YES"+a.get(i)+" "+a.get(j)+"="+N);
                    temp=1;
                    break;
                }
            }
            if(temp==1) {
            	break;
            }
        } 
        if(i == a.size()) {
        	System.out.println("No");
        }
    }
}
