package myprograms;
import java.util.Scanner;
public class GFG {
	
		static boolean isPalindrome(String str)
	    {
	        int i = 0, j = str.length() - 1;
	        while (i < j) {
	 
	            if (str.charAt(i) != str.charAt(j))
	                return false;
	            i++;
	            j--;
	        }
	        return true;
	    }
  
	 	public static void main(String[] args)
	    {
	 		try (Scanner sc = new Scanner(System.in)) {
				String str = sc.nextLine();
				str = str.toLowerCase();
				String resultStr="";  
				for (int i=0;i<str.length();i++)  
				{  
					if (str.charAt(i)>64 && str.charAt(i)<=122) //returns true if both conditions returns true  
					{  
						resultStr=resultStr+str.charAt(i);  
					}  
				}
				
				System.out.println();
				if (isPalindrome(resultStr))
 
				    System.out.println("Yes");
				else
				    System.out.println("No");
			}
	    }
	}
