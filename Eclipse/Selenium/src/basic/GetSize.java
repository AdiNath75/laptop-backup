package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Dimension dim = driver.manage().window().getSize();
		
		System.out.println("Width="+dim.getWidth());
		
		System.out.println("Height="+dim.getHeight());
	}

}
