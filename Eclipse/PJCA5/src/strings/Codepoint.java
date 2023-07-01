package strings;

public class Codepoint {
	
	public static void main(String[] args) {
		
		String str = "Adinath";
		int index = 2;
		int val = codePointAt(str, index);
		int ans = codePointBefore(str, index);
		System.out.println("Code At index "+val);
		System.out.println("Code before index "+ans);
				
	}
	
	public static int codePointAt(String str, int index)
	{
		int val = 0;
		for (int i = 0; i < str.length(); i++) {
			if(i==index) {
				val = str.charAt(i);
			}
		}
		return val;
	}
	public static int codePointBefore(String st, int in)
	{
		int val = 0;
		for (int i = 0; i < st.length(); i++) {
			if(i==in-1) {
				val = st.charAt(i);
			}
		}
		return val;
	}

}
