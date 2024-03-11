package array;

public class AddElePos {
	
		public static void main(String[] args) 
		{
			int arr[] = new int[]{1,5,5,8,6};
			int ele = 4;
			int index = 2;
			arr = addElePos(arr,ele,index);

			for (int i=0;i<arr.length ;i++ )
			{
				System.out.print(arr[i]+" ");
			}
		}

			static int[] addElePos(int arr[],int ele, int index)
			{
				int temp[] = new int[arr.length+1];
				temp[index] = ele;
				for (int i=0;i<temp.length-1 ;i++ )
				{
					if (i<index)
					{
						temp[i] = arr[i];
					}
					else
					{
						temp[i+1] = arr[i];
					}
				}
				return temp;
			}
	}


