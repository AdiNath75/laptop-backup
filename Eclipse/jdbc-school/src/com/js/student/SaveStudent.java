package com.js.student;


public class SaveStudent {
public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(1);
		s.setName("Adi");
		s.setEmail("adi@gmail.com");
		s.setAge(20);
		
		StudentCRUD pc = new StudentCRUD();
		pc.saveProduct(s);
		System.out.println("Inserted");
	}


}
