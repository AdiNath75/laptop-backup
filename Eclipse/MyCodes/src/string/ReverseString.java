package string;

public class ReverseString {
	public static void main(String args[])
	{
	StringBuffer a = new StringBuffer("Java programming is fun");
	String st = a.toString();
	String[] str = st.split(" ");
	for (int i = str.length-1; i >= 0; i--) {
		System.out.print(str[i]+" ");
	}
	}

}
