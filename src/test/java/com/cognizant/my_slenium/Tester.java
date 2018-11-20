package com.cognizant.my_slenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Tester {

	public WebDriver driver= null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void registerTester(){
		driver.get("http://thedemosite.co.uk/addauser.php");
		RegisterMe myRun = PageFactory.initElements(driver, RegisterMe.class);
		myRun.register();
	}
	
	@Test
	public void loginTester() {
		driver.get("http://thedemosite.co.uk/login.php");
		LogMeIn myRun = PageFactory.initElements(driver, LogMeIn.class);
		myRun.login();
		
		AfterMath myRun2 = PageFactory.initElements(driver, AfterMath.class);
		assertEquals(myRun2.testMe(), "**Successful Login**");
	}
	
}
