package com.cognizant.my_slenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogMeIn {
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
	private WebElement enterUsername;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
	private WebElement enterPassword;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
	private WebElement clickMe;
	
	
	public  void login() {
		enterUsername.sendKeys("daudnadeem");
		enterPassword.sendKeys("password");
		clickMe.click();
	}
}
