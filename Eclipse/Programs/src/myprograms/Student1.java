package myprograms;

public class Student1 {  
		   int rollno;//instance variable  
		   String name;  
		   static String college ="ITS";//static variable  
		   //constructor  
		   Student1(int r, String n){  
		   rollno = r;  
		   name = n;  
		   }  
		   static void displayA()
		   {
			   System.out.println("From static");
		   }
		   void display (){System.out.println(rollno+" "+name+" "+college);
		   }  
		  
		} 

