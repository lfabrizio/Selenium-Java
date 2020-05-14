package com.herokuapp.theinternet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveTests {

	public void loginTest() {
		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//		open test page
		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);
		
		// maximixe browser window
		driver.manage().window().maximize();
//		enter userName
//		enter password
//		click login button
//		
//		verification:
//			new URL
//			logout button
//			successful message
	}
	
}
