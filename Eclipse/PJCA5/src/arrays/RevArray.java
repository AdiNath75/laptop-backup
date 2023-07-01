package arrays;


import java.util.Scanner;
public class RevArray {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter length of array");
			int n = sc.nextInt();
			String[] str = new String[n];
			for (int i = 0; i < str.length; i++) {
				str[i] = sc.nextLine();
			}
			for (int i = str.length-1; i >= 0; i--) {
				System.out.println(str[i]);
			}
		}
	}

}
