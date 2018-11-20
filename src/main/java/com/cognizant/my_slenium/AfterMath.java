package com.cognizant.my_slenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterMath {
	
	@FindBy(xpath="/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	private WebElement success;
	
	public String testMe() {
		return success.getText();
	}

}
