package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver cd1 = new ChromeDriver();
		cd1.get("https://demo.actitime.com/login.do");
		
		String expectedurl = "https://demo.actitime.com/login.do1";
		String actualurl = cd1.getCurrentUrl();
		
		if(actualurl.equals(expectedurl)) {
			System.out.println("PASS : url is same");
		}else {
			System.out.println("FAIL : url is not same");
		}
	}

}
