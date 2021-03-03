package pages;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

	public void openTheDefaultUrl() {
		getDriver().get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}

	public void enterUserNameIntoUserNameField(String uname) {
		$("//*[@id=\"identifierId\"]").type(uname);
	}

	public void enterPasswordIntoPasswordField(String pass) {

		$("//*[@id=\"password\"]/div[1]/div/div[1]/input").type(pass);
	}

	public void clickTheSubmitButton() {
		$("//*[@id=\"passwordNext\"]/div/button").click();
	}

	public void clickNext() {
		$("//*[@id=\"identifierNext\"]/div/button").click();
	}
	
	

}
