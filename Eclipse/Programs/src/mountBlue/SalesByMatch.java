package mountBlue;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SalesByMatch {
	 public static void main(String[] args) throws IOException {
	       

	        List<Integer> ar = new ArrayList<>();
	        ar.add(10);
	        ar.add(20);
	        ar.add(20);
	        ar.add(10);
	        ar.add(10);
	        ar.add(30);
	        ar.add(50);
	        ar.add(10);
	        ar.add(20);
	        System.out.println(ar);
	        sockMerchant(ar.size(), ar);
	        
	        
	       
	    }
	 public static int sockMerchant(int n, List<Integer> ar) {
	        int ans = 0;
	        int a = -1;
	        int count = 0;
	        int res = 0;
				for (int i = 0; i < ar.size(); i++) {
					for (Integer integer : ar) {
						if(integer == ar.get(i)) {
							count++;
							ar.remove(i);
					}
				}
			}
	        System.out.println(ar);
	        System.out.println(count);
			return res;

	    }
}
