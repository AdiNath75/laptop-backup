package array;

public class MinArr {
	
	
		public static void main(String[] args) 
		{
			int []arr =new int[]{10,20,30,60,50,40};
			int min = 100;
			for (int i=0;i<arr.length ;i++ )
			{
				if (arr[i]<min)
				{
					min = arr[i];
				}
			}
			System.out.println(min);
		}
	}

