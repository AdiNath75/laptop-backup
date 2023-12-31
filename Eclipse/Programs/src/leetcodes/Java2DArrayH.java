package leetcodes;
import java.io.*;
import java.util.*;

public class Java2DArrayH {
	
	public static void main(String[] args) throws IOException {
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	    List<List<Integer>> arr = new ArrayList<>();
	
	    for (int i = 0; i < 6; i++) {
	        String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
	
	            List<Integer> arrRowItems = new ArrayList<>();

	            for (int j = 0; j < 6; j++) {
	                int arrItem = Integer.parseInt(arrRowTempItems[j]);
	                arrRowItems.add(arrItem);
	            }
	            arr.add(arrRowItems);
	            
	        }
			    bufferedReader.close();
			   System.out.println(arr);  
	}
}
