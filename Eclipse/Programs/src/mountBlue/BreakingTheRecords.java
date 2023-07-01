package mountBlue;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
	
	public static void main(String[] args) {
		
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(5);
		ar.add(20);
		ar.add(20);
		ar.add(4);
		ar.add(5);
		ar.add(2);
		ar.add(25);
		ar.add(1);
		System.out.println(ar);
		List<Integer> temp = new ArrayList<>();
		temp.addAll(ar);
		int count = 0,count1=0;
		for(int i=0;i<ar.size()-1;i++) {
			if(ar.get(i) < ar.get(i+1)) {
				count++;
			}
			else{
				ar.set(i+1, ar.get(i));
			}
		}
		System.out.println(count+" ");
		for(int i=0;i<temp.size()-1;i++) {
			if(temp.get(i) > temp.get(i+1)) {
				count1++;
			}
			else{
				temp.set(i+1, temp.get(i));
			}
		}
		System.out.println(ar);
		System.out.println(temp);
		System.out.print(count1);
	}

}
