package com.herokuapp.theinternet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {
	
	@Test
	public void loginTest() {
		System.out.println("Start logintest");
		
		
		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// sleep for 4 seconds
		sleep(4000);
				
		// maximize browser window
		driver.manage().window().maximize();
		
		//		open test page
		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("page is opened");
		
		// sleep for 4 seconds
		sleep(4000);
		
		
//		enter userName
//		enter password
//		click login button
//		
//		verification:
//			new URL
//			logout button
//			successful message
		// close browser
		driver.quit();
		
		
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
