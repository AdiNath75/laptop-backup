package leetcodes;

public class ValidateIP {
	public static void main(String[] args) {
		String st = "00.16.254.1";
		int count=0;int num = 0;int inc = 0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i) == '.') {
				count++;
			}
		}
		String str = st.replace('.', '@');
		String[] arr = str.split("@", count+1);
		
		try{
			for (String a : arr) {
             num = Integer.parseInt(a);
             if(num>=0 && num<256) {
            	 inc++;
             }
             else {
            	 System.out.println("false1");
             }
		}
		if(inc == count+1) {
			System.out.println(true);
		}
		 else {
        	 System.out.println("false2");
         }
			
		}
		catch (Exception e) {
			System.out.println("false3");
		}	
	}
}
