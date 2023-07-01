package mountBlue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BillDivision {
	public static void main(String[] args) {
		int k = 12;
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(3);
		ar.add(10);
		ar.add(2);
		ar.add(9);
		int ans = 0;
		HashSet<Integer> a = new HashSet<>(ar);
		List<Integer> ar1 = new ArrayList<Integer>(a);
		for(int i=0;i<ar1.size()-1;i++) {
			ans = ans + ar1.get(i);
		}
		int n1 = ans/2;
		System.out.println(k-n1);
	}

}
