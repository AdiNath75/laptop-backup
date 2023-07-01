package string;

public class RemoveChar {
	
	public static void main(String[] args) {
		String str = "asdfgasdfgwerwervcxzsdf";
		
		for (int i = 0; i < str.length(); i++) {
			for(int j=i+1;j<str.length()-1;j++) {
				if(str.charAt(i) == str.charAt(j)) {
					str = charRemoveAt(str,j);
				}
			}
		}	
		System.out.println(str);
	}
	public static String charRemoveAt(String str, int p) {  
		   return str.substring(0, p) + str.substring(p + 1); 
	}

}
