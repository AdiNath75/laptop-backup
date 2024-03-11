package assesment;
import java.io.*;
public class VipulD {
		
	 public static void main(String[] args) throws Exception
	    {
	        File file = new File(
	            "D:\\VS code\\New Project\\Test.txt");
	 
	       try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String st;
			st = br.readLine();
			int count =0;int num=0;
			for(int i=0;i<st.length();i++) {
				if(st.charAt(i) >= '0' && st.charAt(i) <= '9') {
					count++;
				}
			}
			if(count == st.length()) {
				num = Integer.parseInt(st);
				boolean res = isPalindrome(num);
				if(res) {
					System.out.println("It is Palindrome");
						//statement to write data in exel file
				}else {
					System.out.println("It is Not a Palindrome number");
				}
				
			}else {
				System.out.println("It is a text of length"+st.length());
			}
		}
	}
	 	public static boolean isPalindrome(int n) {
	 		int rev = 0,temp=n;
			while (temp!=0)
			{
				int rem = temp%10;
				rev = rev*10+rem;
				temp/=10;
			}
			if (rev==n)
				return true;
			else
				return false;  
	   }
}
