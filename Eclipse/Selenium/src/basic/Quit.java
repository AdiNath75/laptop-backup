 package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver cd = new ChromeDriver();
		
		cd.get("https://www.facebook.com/login");
		
		cd.quit();
	}

}
