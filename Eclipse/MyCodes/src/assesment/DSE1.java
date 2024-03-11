package assesment;

import java.util.Scanner;
import java.util.TreeSet;

public class DSE1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		System.out.println("Enter values of a");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter values of b");
		for(int i=0;i<b.length;i++) {
			b[i] = sc.nextInt();
		}
		TreeSet<Integer> list = new TreeSet<Integer>();
		for(int i=0;i<b.length;i++) {
			list.add(b[i]);
		}
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				list.add(b[i] + b[j]);
			}
		}
		int ans =0;
		TreeSet<Integer> res = (TreeSet<Integer>)list.descendingSet();
		int arr[] = new int[res.size()];
		int i = 0;
		for(Integer num : res) {
			arr[i++] = num;
		}

		for(int j=0;j<arr.length;j++) {
			if(arr[j] <= k) {
				ans = arr[j];
				break;
			}
		}
		System.out.println(ans);
	}
}

