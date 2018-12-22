package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookFlight {
	@FindBy(name = "passFirst0")
	private WebElement firstName;
	
	@FindBy(name = "passLast0")
	private WebElement lastName;
	
	@FindBy(name = "creditnumber")
	private WebElement creditCard;
	
	@FindBy(name = "buyFlights")
	private WebElement submit;
	
	
	public BookFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void bookFlight(String fName, String lName, String ccNumber) {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		creditCard.sendKeys(ccNumber);
		submit.click();
	}
	
}
