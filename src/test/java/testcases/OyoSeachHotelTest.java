package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.OYOSteps;

@RunWith(SerenityRunner.class)
public class OyoSeachHotelTest {
	
	@Managed
	WebDriver driverObj;
	
	@Steps
	OYOSteps Rohan;
	
	@Title(value = "To search for the Hotels for a given location and dates")
	@Test
	public void oyoHotelSearch() {
		//Given
		Rohan.navigateTo();
		
		//When
		Rohan.searchForTheCityAs("New Delhi");
		
		//And 
		Rohan.selectsTheCheckInDateAs("25-January-2021");
		
		//And 
		Rohan.selectsTheCheckOutDateAs("26-January-2021");
		
		//Then
		Rohan.userClickOnSearchButton();
	}

}
