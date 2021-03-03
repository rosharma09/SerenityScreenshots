package steps;

import java.util.List;

import net.thucydides.core.annotations.Step;
import pages.OYOHomePage;

public class OYOSteps {
	
	private String actor;
	
	OYOHomePage oyoHomePage;

	@Step("#actor Navigate to the URL for OYO")
	public void navigateTo() {
		oyoHomePage.openTheApplicationURL();
		
	}
	
	@Step("#actor Check for the city {0}")
	public void checkForPlacesUnder(String city) {
		oyoHomePage.checkForTheLocationsUnderCity(city);
	}

	@Step("#actor Check for the location {0}")
	public void selectTheOptionAs(String location) {
		oyoHomePage.selectTheLocationUnderCityAs(location);
	}
	
	@Step("The hotels are displayed to the #actor")
	public void canSeeThatHotelsAreDisplayed() {
		List<String> HotelNameDisplayed = oyoHomePage.getHotelDetails();
		
		System.out.println("Total Number of hotels displayed: "+HotelNameDisplayed.size());
		
		for(String hotelname : HotelNameDisplayed) {
			System.out.println(hotelname);
		}
	}

	@Step("#actor search for {0}")
	public void searchForTheCityAs(String searchCity) {
		oyoHomePage.searchForTheSelectedLocation(searchCity);
	}

	@Step("#actor enters the checkIn date as {0}")
	public void selectsTheCheckInDateAs(String checkInDate) {
		oyoHomePage.selectTheCheckInDates(checkInDate);
	}

	public void selectsTheCheckOutDateAs(String string) {
		// TODO Auto-generated method stub
		
	}

	public void userClickOnSearchButton() {
		// TODO Auto-generated method stub
		
	}

}
