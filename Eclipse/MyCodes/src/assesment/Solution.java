package assesment;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	//public static List<long> maxSubsetSum(List<Integer> k){
    static List<Long> maxSubsetSum(List<Integer> k) {
        // Complete this function
        int n=k.size();
        List<Long> ls = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=1;j<k.get(n);j++){
                if(k.get(i)%j==0){
                    ls.get(i+=j); 
                }
            }
            ls.get(i+=k.get(i));
        }
        return ls;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        List<Integer> k = new ArrayList<>();
        for(int i = 0; i < k.size(); i++){
            k.add(in.nextInt());
        }
        List<Long> res = maxSubsetSum(k);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + (i != res.size() - 1 ? " " : ""));
        }
        System.out.println("");
        in.close();
    }
}