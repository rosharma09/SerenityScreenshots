package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.OYOSteps;

@RunWith(SerenityRunner.class)
public class OyoHomePageTest {

	@Managed
	WebDriver driverObj;

	@Steps
	OYOSteps Rohan;

	@Steps
	OYOSteps Shubhangi;

	@Steps
	OYOSteps Rahul;
	
	@Steps
	OYOSteps Rajiv;

	@Title(value = "To check that the user is able to check the hotels for bengaluru location")
	@Test
	@Screenshots(onlyOnFailures = true)
	public void user_check_hotel_for_popular_locations_in_bengaluru() {

		// Given
		Shubhangi.navigateTo();

		// When
		Shubhangi.checkForPlacesUnder("Bangalore");

		// And
		Shubhangi.selectTheOptionAs("Whitefield");

		// Then
		Shubhangi.canSeeThatHotelsAreDisplayed();

	}

	@Title(value = "To check that the user is able to check the hotels for Gurgoan location")
	@Test
	@Screenshots(afterEachStep = true)
	public void user_check_hotel_for_popular_locations_in_Gurgaon() {

		// Given
		Rohan.navigateTo();

		// When
		Rohan.checkForPlacesUnder("Gurgaon");

		// And
		Rohan.selectTheOptionAs("DLF Phase 3");

		// Then
		Rohan.canSeeThatHotelsAreDisplayed();

	}

	@Title(value = "To check that the user is able to check the hotels for Mumbai location")
	@Test
	@Screenshots(forEachAction = true)
	public void user_check_hotel_for_popular_locations_in_Mumbai() {

		// Given
		Rahul.navigateTo();

		// When
		Rahul.checkForPlacesUnder("Mumbai");

		// And
		Rahul.selectTheOptionAs("Thane");

		// Then
		Rahul.canSeeThatHotelsAreDisplayed();

	}

	
	@Title(value = "To check that the user is able to check the hotels for Delhi location")
	@Test
	public void user_check_hotel_for_popular_locations_in_Delhi() {

		// Given
		Rajiv.navigateTo();

		// When
		Rajiv.checkForPlacesUnder("Delhi");

		// And
		Rajiv.selectTheOptionAs("Karol Bagh");

		// Then
		Rajiv.canSeeThatHotelsAreDisplayed();

	}

}
