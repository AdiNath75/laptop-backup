package arrays;

public class RevDuplicate {
	public static void main(String[] args) {
		
		int x[] = {10,20,30,40,50};
		int y[] = new int[x.length];
		for (int i = 0; i < y.length; i++) {
			y[y.length-1-i] = x[i];
		}
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
	}
}