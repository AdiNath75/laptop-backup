package leetcodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class DSE3 {
	

	static int minx(int N, List<Integer> A) { 
		HashMap<Integer, Integer> h= new HashMap<>();

	for (int i=0;i<N;i++){

	h.put(A.get(i),h.getOrDefault(A.get(1),0)+1);

	}

	int ans=0;
	int l=0, f=0;
	for (int i: h.keySet()){
	if(f==0){

	l=h.get(1);

	f = 1;
	continue;
	}

	if(1>h.get(i)){
	ans=ans+h.get(1);
	}
	else {
	ans=ans+1;}

	int t=1-h.get(1);
	l=Math.abs(t);
	}
	return ans+1;
	}

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

int N = Integer.parseInt(scan.nextLine().trim());

List<Integer> A= new ArrayList<>(N);

for (int j=0; j<N; j++) {

A.add(Integer.parseInt(scan.nextLine().trim()));

}

int result = minx(N, A);
System.out.println(result);



}

 }
