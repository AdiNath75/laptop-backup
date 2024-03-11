package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	
		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Dimension targetsize = new Dimension(1000, 700);
		
		driver.manage().window().setSize(targetsize);
		}

}
