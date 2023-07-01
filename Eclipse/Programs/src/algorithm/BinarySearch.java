package algorithm;

public class BinarySearch {
	public static int binarySearch(int[] a, int key) {
		int start = 0;
		int end = a.length-1, mid = (start + end)/2 ;
		int pos = -1;
		for (int i = 0; i < a.length; i++) {
			if(key == a[mid]) {
				pos = mid;
			}
			else if(key < a[mid]) {
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
			mid = (start+end)/2;
		}
		return pos;
	}
	public static void main(String[] args) {
		int[] arr = {9, 11, 23, 28, 38, 45, 50, 56, 70};
		int k = 28;
		int ans = binarySearch(arr,k);
		System.out.println("The Element present at "+ans+" position of array");
	}
}
