package leetcodes;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramON {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = "anagram";
        String b = "margana";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
	public static boolean isAnagram(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		else {
			a = a.toLowerCase();
			b = b.toLowerCase();
			char[] c1 = a.toCharArray();
			char[] c2 = b.toCharArray();
		     char[] c3 = bubbleSort(c1);
		     char[] c4 =  bubbleSort(c2);
			int count = 0;
			for(int i=0;i<c3.length;i++) {
				if(c3[i] == c4[i]) {
					count++;
				}
			}
			System.out.println(count);
			if(count == c3.length) {
				return true;
			}
			return false;
		}
	}
	public static char[] bubbleSort(char a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
				char temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		return a;
	}

}
