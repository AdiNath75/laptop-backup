package string;

public class HighestString {
	
		public static void main(String[] args) 
		{
			String st[] = {"Adinath", "Shubham", "Rahul", "Adityanath"};
			String ans=getHigh(st);
			System.out.println(ans);
		}
		public static String getHigh(String st[])
		{
			String hs=st[0];
			for (int i=0;i<st.length ;i++ )
			{
				if (hs.length() < st[i].length())
				{
					hs = st[i];
				}
			}
			return hs;
		}
	

}
