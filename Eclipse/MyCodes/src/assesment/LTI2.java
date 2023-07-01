package assesment;
import java.util.Arrays;
import java.util.HashMap;

public class LTI2 {
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,4,4,5,5,5,5,6,6,6,7,8,9,10};
		int[] temp = new int[arr.length];
		temp = sortFreq(arr);
		printAr(temp);
		sortFreq();
	}
	public static void printAr(int[] temp) {
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
	}
	public static int countMax(int[] arr) {
		int max = 0;
		for (int i=0;i<arr.length ;i++ )
		{
			if (arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	public static int[] sortFreq(int[] arr) {
		int max = countMax(arr);int n1 = 0, temp =0;
		int count[] = new int[max+1];
		for (int i=0;i<arr.length ;i++ )
		{
			count[arr[i]]++;
			if(count[arr[i]] == 1) {
				n1++;
			}
		}
		int[][] ar = new int[max+1][2];
		System.out.println(n1);
		for (int i=1;i<count.length ;i++ )
		{
			if (count[i]!=0)
			{
				ar[i][0] = i;
				ar[i][1] = count[i];
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		int n = 11;
		for (int i = 0; i < n; i++)
	    {
			temp = ar[i][1];
		      for (int j = i + 1; j < n; j++)
		      {
			  if (temp < ar[j][1])
			  {
			      temp = ar[j][1];
			      ar[j][1] = ar[i][1];
			      ar[i][1] = temp;
	
			      temp = ar[j][0];
			      ar[j][0] = ar[i][0];
			      ar[i][0] = temp;
			  }
			}
	    }
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		return count;
	}
	public static void sortFreq() {
		int MAX = 254;
		 int [] a = {1,2,2,3,3,4,4,5,5,5,5,6,6,6,7,8,9,10};
         int n = a.length;
         int[][] arr = new int[MAX][2];
         int[][] brr = new int[MAX][2];

         int k = 0, temp, count;

         for (int i = 0; i < n; i++){
             arr[i][0] = a[i];
             arr[i][1] = 0;
         }

         // Unique elements and its frequency are stored in another array
         for (int i = 0; i < n; i++){
              if (arr[i][1]==1)
                continue;
              count = 1;
              for (int j = i + 1; j < n; j++){
                   if (arr[i][0] == arr[j][0]){
                      arr[j][1] = 1;
                      count++;
                   }
              }
              brr[k][0] = arr[i][0];
              brr[k][1] = count;
              k++;
         }
         n = k;

         //Store the array and its frequency in sorted form
         for (int i = 0; i < n - 1; i++)
         {
             temp = brr[i][1];
             for (int j = i + 1; j < n; j++)
             {
                 if (temp < brr[j][1])
                 {
                      temp = brr[j][1];
                      brr[j][1] = brr[i][1];
                      brr[i][1] = temp;

                      temp = brr[j][0];
                      brr[j][0] = brr[i][0];
                      brr[i][0] = temp;
                  }
              }
          }
          for (int i = 0; i < n; i++)
          {
              while (brr[i][1] != 0){
                    System.out.print(brr[i][0]+" ");
                      brr[i][1]--;
              }
          }
	}
}
