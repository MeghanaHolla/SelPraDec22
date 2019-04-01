package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SignOn;

public class InvalidCredentialsTest extends Base {
	
	
	
	@Test
	public void validateLoginWithInvalidCredentials() {
		Login lp = new Login(driver);
		SignOn so = new SignOn(driver);
		lp.applicationLogin("mercury1", "mercury");
		boolean signOnVisible = so.signOnLink().isDisplayed();
		Assert.assertTrue(signOnVisible);
	}
	

}
