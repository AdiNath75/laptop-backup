package strings;

public class CompareString {
	
	public static void main(String[] args) {
		
		String str1 = "Adinath";
		String str2 = "Adi";
		String str3 = "Adinath Puri";
		int ans = compareTo(str1,str2);
		int res = compareToIc(str1, str3);
		System.out.println(ans);
		System.out.println(res);
		
	}
	public static int compareTo(String str1, String str2)
	{
		int len1 = str1.length();
		int len2 = str2.length();
		return len1 - len2;
	}
	public static int compareToIc(String str1, String str3)
	{
		int len1 = str1.length();
		int len2 = str3.length();
		return len1 - len2;
	}
	

}
