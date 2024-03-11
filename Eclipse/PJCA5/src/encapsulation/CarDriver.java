package encapsulation;

public class CarDriver {
	public static void main(String[] args) {
		
		Car c1 = new Car("TATA","Mate Black","Harrier","SUV",2300000);
		
		c1.displayCar();
		c1.e1.displayEngine();
		
		Car c2 = new Car("TATA","White","Harrier","SUV",2000000);
		
		c2.displayCar();
		c2.e1.displayEngine();
	}
	

}
