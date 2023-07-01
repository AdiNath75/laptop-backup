package abstraction;

public class WhatsappDriver {
	
	public static void main(String[] args) {
		
		Whatsapp w1 = new Whatsapp3();
		
		w1.messageSender("Hiii");
		w1.messageReceiver("Hello");
		
		w1.status("Its Complicated...!");
	}

}
