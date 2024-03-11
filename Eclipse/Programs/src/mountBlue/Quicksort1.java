package mountBlue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Quicksort1 {
	public static void main(String[] args) {
		List<Integer> ar = new ArrayList<Integer>();
		ar.add(4);
		ar.add(5);
		ar.add(3);
		ar.add(7);
		ar.add(2);
		System.out.println(ar);
		HashSet<Integer> s1 = new HashSet<>(ar);
		List<Integer> arr = new ArrayList<Integer>(s1);
		System.out.println(arr);
	}

}
