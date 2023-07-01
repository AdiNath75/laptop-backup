package algorithm;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = {12, 31, 25, 8, 32, 17};
		int temp =0, j=0;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			j = i - 1;
			while(j >=0 && temp <= a[j]) {
				a[j+1] = a[j];
				j = j - 1;
			}
			a[j+1] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
