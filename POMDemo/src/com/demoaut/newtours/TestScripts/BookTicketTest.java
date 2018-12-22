package com.demoaut.newtours.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.*;

public class BookTicketTest extends Base {

	
	
	@Test
	public void ticketBookingTest() {
		Login lp = new Login(driver);
		lp.applicationLogin("mercury","mercury");
		FindFlights ff = new FindFlights(driver);
		ff.findFlight();
		SelectFlight sf = new SelectFlight(driver);
		sf.selectFlight();
		BookFlight bf = new BookFlight(driver);
		bf.bookFlight("Meghana", "Holla", "2323233");
		
		String expected_msg = "Your itinerary has been booked!";
		FlightConfirmtion fc = new FlightConfirmtion(driver);
		String actualMsg = fc.successMsg().getText();
		Assert.assertEquals(expected_msg, actualMsg);
	}
	
	
}
