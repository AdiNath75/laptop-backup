package leetcodes;
import java.util.*;

public class JavaList {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> line = new ArrayList<Integer>();
		int d = in.nextInt();
		for (int j = 0; j < d; j++) {
			line.add(in.nextInt());
		}
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			String st = in.next();
			switch(st) {
			case "Insert":
				int x = in.nextInt();
				int y = in.nextInt();
				line.add(x, y);
				break;
			case "Delete":
				int z = in.nextInt();
				line.remove(z);
			}
		}
		for(int i=0;i<line.size();i++) {
			System.out.print(line.get(i)+" ");
		}
		
		in.close();
	}
	

}
