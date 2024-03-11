package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			ChromeDriver cd1 = new ChromeDriver();
			cd1.get("https://www.google.com");
		}

	}
