package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.booking.com/")
public class BookingPage extends PageObject{
	
	private final WebElementFacade locationSearchField = $("//*[@id=\"ss\"]");

	public void searchWithLocation(String location) {
		locationSearchField.type(location);
	}
	

}
