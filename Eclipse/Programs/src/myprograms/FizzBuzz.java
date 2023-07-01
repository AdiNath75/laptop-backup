package myprograms;

import java.util.*;
import java.io.*;

public class FizzBuzz {
	public static void main(String[] args) {
	
	Scanner Sc = new Scanner(System.in);
	System.out.print(stCh(Sc.nextInt()));

	}
	public static String stCh(int num) {
		String str = "";
		for(int i=1;i<=num;i++) {
			if(num%3==0 && num%5==0) {
				str = str + "FizzBuzz"+" ";
			}
			else if(num%3==0) {
				str = "Fizz ";
			}
			else if(num%5==0) {
				str =  "Buzz ";
			}
			else {
				str = str +num+" ";
			}
		}
		return str;
	}
}
