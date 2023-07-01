package assesment;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sample {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
        	arr[i]= in.nextInt();
        }
        int a = in.nextInt();
        int b= in.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=a && arr[i] <= b) {
				System.out.print(arr[i]+" ");
			}
		}
    }
}