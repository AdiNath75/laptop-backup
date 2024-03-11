package com.iris;

public class CodeGenerator {
	
	public static void main(String[] args) {
		String str = "deshmukhdarshan681@gmail.com";
		
		codeGenerate(str);
	}

	private static void codeGenerate(String str) {
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			if(i%2 == 0){
				st = st + str.charAt(i);
			}
		}
		st = st.toUpperCase();
		
		System.out.println(st);
	}
	
}
