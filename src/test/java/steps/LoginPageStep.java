package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginPageStep {

	LoginPage loginPageObject;

	@Step("Navigating to the gmail login page")
	public void navigateTo() {
		loginPageObject.openTheDefaultUrl();
	}

	@Step("Entering the user name in the username field")
	public void enterUserName(String username) {

		loginPageObject.enterUserNameIntoUserNameField(username);

	}

	@Step
	public void enterPassword(String pass) {
		loginPageObject.enterPasswordIntoPasswordField(pass);
	}

	@Step
	public void clickOnSubmit() {
		loginPageObject.clickTheSubmitButton();
	}

	@Step
	public void clickOnNextButton() {
		loginPageObject.clickNext();
	}

}
