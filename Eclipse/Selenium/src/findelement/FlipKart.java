package findelement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FlipKart {


	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("img[alt='Grocery']")).click();
		Thread.sleep(4000);
		driver.quit();
		
		WebDriver driver1 = new ChromeDriver();
		Thread.sleep(7000);
		driver1.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver1.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		driver1.findElement(By.cssSelector("img[alt='Mobiles']")).click();
		Thread.sleep(4000);
		driver1.quit();
		Thread.sleep(6000);
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver2.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(4000);
		driver2.findElement(By.cssSelector("img[alt='Electronics']")).click();
		Thread.sleep(4000);
		driver2.quit();
		Thread.sleep(6000);
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver3.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		driver3.findElement(By.cssSelector("img[alt='Fashion']")).click();
		Thread.sleep(5000);
		driver3.quit();
		
		WebDriver driver4 = new ChromeDriver();
		driver4.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver4.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		driver4.findElement(By.cssSelector("img[alt='Home']")).click();
		Thread.sleep(5000);
		driver4.quit();
		
		WebDriver driver5 = new ChromeDriver();
		driver5.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver5.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		driver5.findElement(By.cssSelector("img[alt='Appliances']")).click();
		Thread.sleep(5000);
		driver5.quit();
		
		WebDriver driver6 = new ChromeDriver();
		driver6.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver6.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		driver6.findElement(By.cssSelector("img[alt='Travel']")).click();
		Thread.sleep(5000);
		driver6.quit();
		
		WebDriver driver7 = new ChromeDriver();
		driver7.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver7.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
		driver7.findElement(By.cssSelector("img[alt='Beauty, Toys & More']")).click();
		Thread.sleep(5000);
		driver7.quit();
		
	}
}