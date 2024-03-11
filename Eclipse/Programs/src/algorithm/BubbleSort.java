package algorithm;

public class BubbleSort {
	public static int[] bubbleSort(int[] arr) {
		int temp1 = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					temp1 = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp1;
				}
			}
			
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {10, 35, 32, 13, 26};
		arr = bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
