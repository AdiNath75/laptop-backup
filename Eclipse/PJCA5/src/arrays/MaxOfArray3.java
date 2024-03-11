package arrays;

public class MaxOfArray3 {
	
	public static void main(String[] args) {
		
		int a[] = {92,26,81,50,81,45,85,100,50,81,82,83,84};
		int max = 0;
		int max2 = 0;
		int max3 = 0;
		for (int i = 0; i < a.length; i++) {
			if(max < a[i])
			{
				max3= max2;
				max2 = max;
				max = a[i];
			}
			else if(max2 < a[i]) {
				max3 = max2;
				max2 = a[i];	
			}
			else if(max3 < a[i])
			{
				max3 = a[i];
			}
		}
		System.out.println(max3);
	}
}
