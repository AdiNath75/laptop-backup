package assesment;

import java.util.Scanner;

public class code2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a*b;
		 String num = toBinary(c);
		 System.out.println(num);
		 int count =0;
		 for(int i=0;i<num.length();i++) {
			 if(num.charAt(i) == '1') {
				 count++;
			 }
		 }
		 System.out.println(count);
	}
	public static String toBinary(int decimal){    
	     int binary[] = new int[40];    
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;    
	       decimal = decimal/2;    
	     }    
	     String st = "";
	     for(int i = index-1;i >= 0;i--){    
	       st = st +binary[i];    
	     }  
	     return st;
	}    

}
