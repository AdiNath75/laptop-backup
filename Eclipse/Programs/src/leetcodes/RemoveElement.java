package leetcodes;

public class RemoveElement {
	public static void main(String[] args) {
		int arr[] = {0,1,2,2,3,0,4,2};
		int num = 2;
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  remove(arr,num);	
			System.out.print(arr[i]+" ");
		}
	}
	public static int remove(int []a,int num)
	{
		int i=0;
		for (int j = 0; j < a.length; j++) {
			if(a[j] != num) {
				a[j] = a[i];
				i++;
			}
			j++;
		}
		return i;
	}
}
