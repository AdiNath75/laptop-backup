package numbers;

import java.util.*;

public class StringArray {
	public static void main(String[] args) {
		String[] arr = {"asd", "qwe", "azxc"};
		for(String str : arr) {
			for(int i=0;i<str.length();i++) {
				System.out.print(str.charAt(i)+" ");
			}
			System.out.println();
		}
		char[] st = {'a','b','c'};
		for(char ch : st) {
			System.out.println(ch);
		}
	}

}
