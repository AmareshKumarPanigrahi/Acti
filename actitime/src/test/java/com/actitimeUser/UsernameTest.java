package com.actitimeUser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsernameTest {
	@Test
	public  void ma() {
		String browser="chrome";
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		if(browser.equals("chrome")) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		}
		else if(browser.equals("edge")) {
			WebDriver driver =new EdgeDriver();
			driver.get("facebook.com");
		}
		
		
		
	}
	
	

}
