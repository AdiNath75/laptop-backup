package assesment;

public class Kanaka {
	public static void main(String[] args) {
		int n=5;
		int[] a = {4,3,7,1,2};
		int ans =0;int res =0;
		int[] b = new int[a.length];
		a = bubbleSort(a);
		b[0] = 0;
		for(int i=1;i<b.length;i++) {
			b[i] = a[i-1] + b [i-1];
		}
		for(int i=0;i<b.length;i++) {
			ans = ans + b[i];
		}
		System.out.println(ans);
		res = ans / n;
		System.out.println(res);
	}
	public static int[] bubbleSort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		return a;
	}

}
