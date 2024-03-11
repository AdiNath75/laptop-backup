package arrays;

public class ArrayConEqual {
	
	public static void main(String[] args) {
		int a[] = {75,25,50,42,70,82,90,33,6,0};
		int b[] = {75,25,50,42,70,82,90,33,6,0};
		int num = 5;
		boolean res = equals(a,b);
		boolean ans = contain(a, num);
		System.out.println(ans);
		System.out.println(res);
	}
	public static boolean contain(int a[],int num)
	{
		int i;
		for (i = 0; i < a.length; i++) {
			if(a[i]==num) {
				return true;
			}
		}
		if(i == a.length) {
			return false;
		}
		return false;
	}
	public static boolean equals(int a[], int b[])
	{
		boolean ans = false;
		if(a.length == b.length)
		{
			for (int i = 0; i < a.length; i++) {
				if(a[i]==b[i]) {
					ans = true;
				}
				else {
					ans = false;
				}
			}
			return ans;
		}
		else 
			return ans;
	}
}
