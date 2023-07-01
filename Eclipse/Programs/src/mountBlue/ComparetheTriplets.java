package mountBlue;

import java.util.ArrayList;
import java.util.List;

public class ComparetheTriplets {
	public static void main(String[] args) {
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		List<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(3);
		ar1.add(2);
		ar1.add(1);
		List<Integer> ar2 = new ArrayList<Integer>();
		int n1 = 0, n2=0;
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i)>ar1.get(i)) {
				n1++;
			}
			else if(ar.get(i)<ar1.get(i)) {
				n2++;
			}
		}
		ar2.add(n1);
		ar2.add(n2);
		System.out.println(ar2);
	}

}
