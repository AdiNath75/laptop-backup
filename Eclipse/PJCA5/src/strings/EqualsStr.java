package strings;

public class EqualsStr {
	
	public static void main(String[] args) {
		
		String str = "Adinath";
		String str1 = "Adinath";
		String str2 = "AdiNath";
		boolean ans = equals(str, str1);
		boolean res = equalsIgnoreCase(str1, str2);
		System.out.println(ans);
		System.out.println(res);
	}
	public static boolean equals(String str, String str1) {
		if(str.length() == str1.length())
		{
			int i;
			int j=0;
			for(i=0;i<str.length();i++) {
				if(str.charAt(i) == str1.charAt(i)) {
					j++;
				}
				else
				{
					return false;
				}
			}
			if(i == j) {
				return true;}
			}
			return false;
	}
	public static boolean equalsIgnoreCase(String str1, String str2) {
		if(str1.length() == str2.length())
		{
			int i;
			int j=0;
			for(i=0;i<str1.length();i++) {
				if((str1.charAt(i) == str2.charAt(i)) || (str1.charAt(i)+32 == str2.charAt(i)) || (str1.charAt(i)-32 == str2.charAt(i))) {
					j++;
				}
				else
				{
					return false;
				}
			}
			if(i == j) {
				return true;}
			}
			return false;
	}

}
