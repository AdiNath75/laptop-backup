package com.practice.whitebelt;

public class FirstSetBit {
	
	public static void main(String[] args) {
		
		int num = 18;
		solution(num);
		toBinary(num);
		
	}

	private static void solution(int num) {
		String str = Integer.toBinaryString(num);
		System.out.println(str);
		int count = 0;
		char[] arr = str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+ " ");
			if(arr[i] == '1') {
				count = i;
				break;
			}
		}
		System.out.println(arr.length - count);
		
	}

	static void printBinary(int[] binary, int id)
    {
        // Iteration over array
        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }
 
    public static void toBinary(int num)
    {
        int[] binary = new int[35];
        int id = 0;
         while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }
         
    }

}
