package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OYOHomePage extends PageObject {

	private List<WebElementFacade> cityDataHeader;
	// private List<WebElementFacade> locationData;
	private List<WebElementFacade> hotelsDisplayed;

	public void openTheApplicationURL() {
		getDriver().get("https://www.oyorooms.com/");
	}

	public void checkForTheLocationsUnderCity(String city) {

		cityDataHeader = withTimeoutOf(Duration.ofSeconds(10000))
				.findAll(By.xpath("//div[@class = 'mddCityItem__cityData']/h2"));

		System.out.println("Selected City: " + city);

		for (WebElementFacade cityHeader : cityDataHeader) {
			if (cityHeader.getText().equals(city)) {
				withAction().moveToElement(cityHeader).perform();
			}
		}

	}

	public void selectTheLocationUnderCityAs(String location) {

//		locationData = withTimeoutOf(Duration.ofSeconds(10000))
//				.findAll(By.xpath("//div[@class = 'mddCityPopUp d-popup']/a"));
//
//		for (WebElementFacade locn : locationData) {
//			if (locn.getText().equals(location)) {
//				withAction().moveToElement(locn).perform();
//				withAction().click(locn).perform();
//				break;
//			}
//		}

		withTimeoutOf(Duration.ofSeconds(10000))
				.find(By.xpath("//div[@class = 'mddCityPopUp d-popup']/a[text() = '" + location + "']")).click();
	}

	public List<String> getHotelDetails() {

		hotelsDisplayed = withTimeoutOf(Duration.ofSeconds(10000))
				.findAll(By.xpath("//div[@class = 'listingHotelDescription__contentWrapper']//h3"));

		List<String> hotelDetails = new ArrayList<String>();

		for (WebElementFacade hotel : hotelsDisplayed) {
			hotelDetails.add(hotel.getText());
		}

		return hotelDetails;
	}

	public void searchForTheSelectedLocation(String searchCity) {
		// In order to take the screenshot at any arbitary point we can use the take
		// screenshot function of the Serenity class
		Serenity.takeScreenshot();
		$("//input[@id = 'autoComplete__home']").sendKeys(searchCity);
	}

	public void selectTheCheckInDates(String checkInDate) {
		String[] checkInDateSplit = checkInDate.split("-");
		$("//span[@class = 'datePickerDesktop__checkInOutText']").click();
		$("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[2]/div/span/div/div/div[2]/div/span[1]/select")
				.selectByVisibleText(checkInDateSplit[1]);

		$("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[1]/div/div[2]/div/span/div/div/div[2]/table")
				.thenFindAll(By.tagName("td"));

	}

}
