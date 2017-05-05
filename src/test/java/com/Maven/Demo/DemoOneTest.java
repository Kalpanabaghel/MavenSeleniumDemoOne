package com.Maven.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoOneTest {
	
	@Test
	public void methodOne(){
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.flipkart.com");
		
		System.out.println("MAVEN PROJECT ");
		
		
		
		
		
		
	}
	
	
	
	
}