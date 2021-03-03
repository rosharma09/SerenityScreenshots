package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.BookingHotelSteps;

@RunWith(SerenityRunner.class)
public class BookingHotelTest {
	
	@Steps
	BookingHotelSteps bookHotelSteps;
	
	@Managed
	WebDriver driverObj;
	
	@Title(value = "To Book a hotel using the Bookings.com website")
	@Test
	public void hotelBookingTest1() {
		
		//Given: Navigate to the booking.com website
		bookHotelSteps.navigateTo();
		
		//When: User search for a location in the location search box
		bookHotelSteps.selectLocationAs("ooty");
		
		
	}

}
