package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;

public class ValidateLogin extends Base{
	
	
	@Test
	public void validateLogin() {
		Login lp = new Login(driver);
		lp.applicationLogin("mercury","mercury");
		boolean singOffExist = driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
		Assert.assertTrue(singOffExist);
		
	}
	
	
}
