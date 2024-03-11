package leetcodes;

import java.util.Scanner;

public class EncryptString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String st1 = "";
		String st2 = "";
		int count;
		for(int i=0;i<st.length();i++) {
			count = 1; 
			for(int j=i+1;j<st.length();j++) {
				if(st.charAt(i) == st.charAt(j)) {
					st = charRemoveAt(st,j);
					count++;
					j--;
				}
			}		
			st1 = Integer.toHexString(count)+ "" + st.charAt(i) ;

			st2 = st2 +""+st1;
		}
		System.out.println(st2);
	}
	public static String charRemoveAt(String str, int p) {  
		   return str.substring(0, p) + str.substring(p + 1); 
	}
	public static void geek(String S) {
			String ans="";
			Character curr=S.charAt(S.length()-1);
	    int count=1;
	    for(int i=S.length()-2;i>=0;i--){
	        if(curr==S.charAt(i)){
	            count+=1;
	        }else{
	            ans=ans+Integer.toHexString(count)+curr;
	            count=1;
	            curr=S.charAt(i);
	        }
	    }
	    ans=ans+Integer.toHexString(count)+curr;
	    System.out.println(ans);
	}

}  
