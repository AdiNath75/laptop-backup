package interfaces;

public class ABDriver {
	
	public static void main(String[] args) {
		A a1 = (s)-> {
			System.out.println("Writing Lambda Function");
			System.out.println(s);
		};
		
		a1.write("I am Adi");
	}
	

}
