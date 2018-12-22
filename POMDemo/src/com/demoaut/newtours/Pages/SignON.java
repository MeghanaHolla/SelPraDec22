package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignON {
	
	@FindBy (linkText="SIGN-ON")
	private WebElement signon;
	
	public SignON(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement validateSignOn() {
		return signon;
	}
}
