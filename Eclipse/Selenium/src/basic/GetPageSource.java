package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver cd = new ChromeDriver();
		
		cd.get("https://demo.actitime.com/login.do");
		
		String expectedpagesource = ("Please identify yourself");
		
		String actualpagesource = cd.getPageSource();
		
		//System.out.println(element);
		
		if(actualpagesource.contains(expectedpagesource)) {
			System.out.println("PASS : Pagesource is present");
		}else {
			System.out.println("FAIL : Pagesource is not present");
		}
	}

}
