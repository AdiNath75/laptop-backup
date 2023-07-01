package basic;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Point point = driver.manage().window().getPosition();
		
		System.out.println("StartX="+point.getX());
		
		System.out.println("StartY="+point.getY());
}

}
