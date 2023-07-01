package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeDriver cd = new ChromeDriver();
	
	cd.get("https://www.geeksforgeeks.org/");
	
	cd.close();
	}

}
