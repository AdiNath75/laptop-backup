package mountBlue;

import java.util.ArrayList;
import java.util.List;

public class BetweeTwoSets {
	public static void main(String[] args) {
		int count=0;
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(2);
		ar.add(6);
		List<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(24);
		ar1.add(36);
		List<Integer> ar2 = new ArrayList<Integer>();
		for(int i=1;i<=ar1.get(0);i++) {
			int j;
			for(j=0;j<ar.size();j++) {
				if((i%ar.get(j)==0)){
					continue;
				}else {
					break;
				}
			}
			if(j==ar.size()) {
				ar2.add(i);
			}
		}
		for(int i=0;i<ar2.size();i++) {
			int j;
			for(j=0;j<ar1.size();j++) {
				if(ar1.get(j)%ar2.get(i)==0) {
					continue;
				}
				else {
					break;
				}
			}
			if(j==ar1.size()) {
				count++;
			}
		}
		System.out.println(count);
	}

}
