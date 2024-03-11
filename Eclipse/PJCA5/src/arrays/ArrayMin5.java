package arrays;

public class ArrayMin5 {
	
	public static void main(String[] args) {
		int a[] = {92,26,81,50,81,45,85,100,55,56,54,52,82,83,84};
		int min1 = 100, min2=100, min3=100, min4=100, min5=100;
		
		for (int i = 0; i < a.length; i++) {
			if(min1 > a[i])	{
				min5 = min4;
				min4 = min3;
				min3 = min2;
				min2 = min1;
				min1 = a[i];
			}
			else if(min2 > a[i]) {
				min5 = min4;
				min4 = min3;
				min3 = min2;
				min2 = a[i];
			}
			else if(min3 > a[i]) {
				min5 = min4;
				min4 = min3;
				min3 = a[i];
			}
			else if(min4 > a[i]) {
				min5 = min4;
				min4 = a[i];
			}	
			else if(min5 > a[i]) {
				min5 = a[i];
			}
		}
		System.out.println(min5);
	}

}
