package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
		
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			ChromeDriver cd1 = new ChromeDriver();
			cd1.get("https://demo.actitime.com/login.do");
			String expectedtitle = "Please identify yourself";
			String actualtitle = cd1.getTitle();
			
			if(actualtitle.equals(expectedtitle)) {
				System.out.println("PASS : Title is same");
			}else {
				System.out.println("FAIL : Title is different");
			}
		}

	}
