package basic;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Window window = driver.manage().window();
		
		window.maximize();
		
		Thread.sleep(2000);
		
		window.minimize();
		
		Thread.sleep(2000);
		
		window.fullscreen();
	}

}
