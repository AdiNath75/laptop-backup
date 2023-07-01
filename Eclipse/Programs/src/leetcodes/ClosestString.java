package leetcodes;

import java.util.ArrayList;
import java.util.Scanner;

public class ClosestString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> s = new ArrayList<>();
		s.add("geeks");
		s.add("for");
		s.add("geeks");
		s.add("fox");
		s.add("pract");
		System.out.println("Enter First word");
		String w1 = "geeks";
		System.out.println("Enter Second Word");
		String w2 = "pract";
		System.out.println(distance(s,w1,w2));
		
	}
	static int distance(ArrayList<String> s,String w1,String w2)
	{
		String words[] = new String[5];
	    if (w1 .equals( w2) )
	        return 0 ;
	    int i=0;
	  for(String st : s) {
		  words[i] = st;
		  i++;
	  }
	   
	    int min_dist = (words.length) + 1;
	  
	    for (int index = 0;
	         index < words.length ; index ++)
	    {
	  
	        if (words[index] .equals( w1))
	        {
	            for (int search = 0;
	                 search < words.length; search ++)
	            {
	                if (words[search] .equals(w2))
	                {
	                    int curr = Math.abs(index - search) - 1;
	  
	                    if (curr < min_dist)
	                    {
	                        min_dist = curr ;
	                    }
	                }
	            }
	        }
	    }
	    return min_dist+1;
	}

}
