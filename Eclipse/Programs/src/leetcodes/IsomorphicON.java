package leetcodes;

public class IsomorphicON {
	public static void main(String[] args) {
		String st1 = "aab";
		String st2 = "xxy";
		String str1 = freq(st1);
		String str2 = freq(st2);
		System.out.println(str1 + " - " +str2);	
	}
	public static String freq(String st) {
		String st1 = "";
		String st2 = "";
		int count;
		for(int i=0;i<st.length();i++) {
			count = 1; 
			for(int j=i+1;j<st.length();j++) {
				if(st.charAt(i) == st.charAt(j)) {
					count++;
				}
			}		
			st1 = st1 + count;

			st2 = st2 +""+ st1;
		}
		return st2;
	}
	public static String charRemoveAt(String str, int p) {  
		   return str.substring(0, p) + str.substring(p + 1); 
	}

}
