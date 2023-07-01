package assesment;
import java.util.Scanner;

public class Lentra {
	
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Size of an Array");
			int n = s.nextInt();
			int x[]= new int[n];
			System.out.println("Enter "+n+" Values");
			for (int i=0;i<x.length ;i++ )
			{
				x[i]=s.nextInt();
			}
			int arr1[] = processArray(x);
			for (int i=0;i<arr1.length ;i++ )
			{
				System.out.println(arr1[i]);
			}	
		}
		public static int[] processArray(int[] x)
		{
			for (int i=0;i<x.length ;i++ )
			{
				if (x[i]>0)
				{
					int rem = x[i]%10;
					if (x[i]>46 && rem==3)
					{
						x[i]=-1;
					}
					else if (x[i]>46)
					{
						x[i]=-3;
					}
					else if (rem==3)
					{
						x[i]=-9;
					}	
				}else {
					x[i]=0;
				}
			}
			return x;
		}
}
