package array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Arraymagic {
	public static void main(String[] args) {
		int[] arr = {0,4,0,0,1,3,4,1,0,2};
			int n = arr.length;
			int[] temp = new int[arr.length];
			for(int i =0;i<arr.length;i++) {
				temp[i] = arr[i];
			}
			for (int i = 0; i < n - 1; i++){
				for (int j = 0; j < n - i - 1; j++){
					if (arr[j] > arr[j + 1]) {
						int t = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = t;
					}
	            }
			}
			print(arr);
			print(temp);
			int n1 = 0,n2=0;
			for(int i=0;i<arr.length;i++) {
				if(temp[i] == arr[i]) {
					n1 = n1 + temp[i];
				}else {
					n2 = n2 + temp[i];
				}
			}
			System.out.println(n1-n2);
	}
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

