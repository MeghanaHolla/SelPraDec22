package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.BookFlight;
import com.demoaut.newtours.Pages.FlightConfirmation;
import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SelectFlight;

public class FlightBookingTestScript extends Base {
	
	
	@Test
	public void ticketBookingTest() {
		Login lp = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookFlight bf = new BookFlight(driver);
		FlightConfirmation fc = new FlightConfirmation(driver);
		
		lp.applicationLogin("mercury1","mercury");
		ff.findFlights();
		sf.selectFlight();
		bf.bookFlight("john", "smith", "232324343");
		
		String expectedResult = "Your itinerary has been booked!";
		String actualResult = fc.flightConfirmationText().getText();
		Assert.assertEquals(actualResult, expectedResult);
	}
	

}
