package encapsulation;

public class MobileDriver {
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("Nokia","6.1 plus","ADS12345","Snapdragon","Black",2,4,64,15000);
		
		m1.displayMobile();
		
		m1.insertSIm("JIO", "4G", "Micro", 9876541230l, "Prepaid");
		
		m1.s1.displaySim();
		
		m1.insertSIm("Airtel", "4G", "Nano", 987654456l, "Prepaid");
		
		m1.s1.displaySim();

		
	}
}
