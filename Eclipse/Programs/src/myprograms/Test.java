package myprograms;

public class Test{  
	public static void main(String args[]){ 
		int arr[] = {1,1,5,5,2,2,7};
		for(int i=0;i<7;i++)
		{
			int j= i;
			while((j>0) && (arr[j]<arr[j-1]))
					{
					int k= arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = k;
					j = j-1;
					}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
