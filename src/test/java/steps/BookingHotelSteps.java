package steps;

import net.thucydides.core.annotations.Step;
import pages.BookingPage;

public class BookingHotelSteps {
	
	BookingPage bookingPageObj;

	@Step("Navigating to the booking.com website")
	public void navigateTo() {
		bookingPageObj.open();
	}

	@Step("Search for the location as {0}")
	public void selectLocationAs(String location) {
		bookingPageObj.searchWithLocation(location);
	}

}
