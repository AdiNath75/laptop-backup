package myprograms;

public class Test1 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,50,70,58,9};
		
		int a = 25;
		int in = 4;
		arr = update(arr,in,a);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] update(int[] arr, int in,int a) {
		int[] ar = new int[arr.length];
		arr[in] = a;
		for(int i=0;i<arr.length;i++) {
			if(i < in) {
				ar[i]=arr[i];
			}
			else  {
				ar[i] = arr[i];
			}
		}
		return ar;	
	}
}