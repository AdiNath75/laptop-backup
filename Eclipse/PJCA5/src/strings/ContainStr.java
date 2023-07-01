package strings;

public class ContainStr {
	
	public static void main(String[] args) {
		
		String str = "Adinath";
		String st = "ina";
		String str1 = "Adinath";
		
		boolean res = contentEquals(str,st);
		boolean ans = contains(str, st);
		System.out.println(res);
		System.out.println(ans);
	}
	public static boolean contentEquals(String str, String str1)
	{
		int i;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i) == str1.charAt(i)) {
			}	
			else {return false;}
		}
		if(i == str.length()) {
			return true;
		}
		return true;
	}
	public static boolean contains(String str, String st)
	{
		int i;
		int j=0;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)==st.charAt(j))
			{
				j++;
				if(j==st.length()) {
					break;}
			}
			
		}
		if(j == st.length())
		{
			return true;
		}
		return false;
	}

}
