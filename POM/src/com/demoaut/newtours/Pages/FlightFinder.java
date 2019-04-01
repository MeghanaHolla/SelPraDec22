package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=\"radio\"]:nth-child(2)")
	private WebElement bussClass;
	
	@FindBy(name="airline")
	private WebElement airlineName;
	
	@FindBy(name="findFlights")
	private WebElement submit;
	
	public FlightFinder(WebDriver driver){

		PageFactory.initElements(driver,this);

	}
	
	public void findFlights() {
		bussClass.click();
		Select airline = new Select(airlineName);
		airline.selectByIndex(1);
		submit.click();
	}
	
}
