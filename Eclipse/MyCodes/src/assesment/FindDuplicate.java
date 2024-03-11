package assesment;

import java.util.*;

public class FindDuplicate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			int num = in.nextInt();
			if(num >= 0 && num <= n) {
				arr[i] = num;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		duplicate(arr);
	}
	public static void duplicate(int a[])
    {
       ArrayList<Integer> al = new ArrayList<>();
  
        for (int i = 0; i < a.length; i++) {
            a[a[i] % a.length]
                = a[a[i] % a.length]
                  + a.length;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= a.length * 2) {
                al.add(i);
            }
        }
        System.out.println("max"+al.get(al.size()-1));
    }

}
