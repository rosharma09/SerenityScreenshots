package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import steps.LoginPageStep;

@RunWith(SerenityRunner.class)
public class LoginPageTest {

	@Managed
	WebDriver driverObj;

	@Steps
	LoginPageStep loginPageStep;

	@Test
	public void checkLoginFeature() {
		// given
		loginPageStep.navigateTo();

		// When
		loginPageStep.enterUserName("rosharma0906@gmail.com");

		// And
		loginPageStep.clickOnNextButton();

		//When
		loginPageStep.enterPassword("password");

		// And
		loginPageStep.clickOnSubmit();
	}

}
