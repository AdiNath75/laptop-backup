package algorithm;

public class LinearSearch {
	public static int linearSearch(int[] arr, int k) {
		int in = -1,i=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				return i+1;
			}
		}
		
		return in;
	}
	public static void main(String[] args) {
		int[] arr = {70, 40, 30, 11, 57, 41, 25, 14, 52};
		int k = 25;
		int ans = linearSearch(arr,k);
		System.out.println("The Element present at "+ans+" position of array");
	}

}
