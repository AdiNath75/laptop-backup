package arrays;

public class MaxOfArray {
	
	public static void main(String[] args) {
		
		int a[] = {90,256,89,24,10,37,10,504,0,4,2,4,85,100,50};
		int max = 0;
		int max2 = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max2 = max;
				max = a[i];
			}
			else if(max2 < a[i]) {
				max2 = a[i];
			}
		}
		System.out.println(max2);	
	}
}