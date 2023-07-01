package leetcodes;

public class ReverseWords {
	public static void main(String[] args) {
		
		String str = "asd qwe zxc";
		int count = count(str);
		System.out.println(count);
        String[] arr = str.split(" ");
		  for(int i=arr.length-1;i>=0;i--) {
			  System.out.print(arr[i]);
			  if(i>0) {
				  System.out.print(" ");
			  }
		  }
      }
	public static int count(String st) {
		int count = 0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}
}
