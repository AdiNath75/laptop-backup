package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LanchGoogle {
	public static void main(String[] args) {
		
	String key = "webdriver.chrome.driver";
	String value = "./drivers/chromedriver.exe";
	System.setProperty(key, value);
	
	ChromeDriver cd1 = new ChromeDriver();
	cd1.get("https://www.google.com");
	
	}
}
