package leetcodes;

public class CommonPrefix {
	public static void main(String[] args) {
		String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
		int[] num = new int[arr.length-1];
		if(arr[0].charAt(0) == arr[1].charAt(0)) {
			for(int i=0;i<arr.length-1;i++) {
				int count = 0;
				int length = (arr[i].length() < arr[i+1].length())? arr[i].length():arr[i+1].length();
				
				for(int j=0;j<length;j++) {
					if(arr[i].charAt(j) == arr[i+1].charAt(j)) {
						count++;
					}
					else {
						break;
					}
				}
				for (int k = 0; k < num.length; k++) {
					num[i] = count;
				}
			}
			int min = 100;
			for(int i=0;i<num.length;i++) {
				if(num[i]<min) {
					min = num[i];
				}
			}
			String st = arr[0].substring(0, min);
			System.out.println(st);
		}
		else {
			System.out.println(-1);
		}
		}

}
