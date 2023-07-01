package abstraction;

public interface Whatsapp {
	
	void messageSender(String ip);
	void audioSender();
	public abstract void emojiSender();
	void photoSender();
	
	void messageReceiver(String ip);
	void audioReceiver();
	public abstract void emojiReceiver();
	void photoReceiver();
	
	void status(String st);
}
