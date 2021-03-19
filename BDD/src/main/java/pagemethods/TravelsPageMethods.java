package pagemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageelements.TravelsPageElements;

public class TravelsPageMethods extends TravelsPageElements {

	public TravelsPageMethods(WebDriver driver) {
		super(driver);
	}

	public void clickOnRegisterOption() {
		registerOption.click();
	}

	public void enterFirstName(String firstname) {
		firstNameTextbox.sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		lastNameTextbox.sendKeys(lastname);
	}

	public void enterPhoneNumber(String phone) {
		phoneNumberTextbox.sendKeys(phone);
	}

	public void enterUsername(String username) {
		usernameTextbox.sendKeys(username);
	}

	public void enterAddress(String address) {
		addressTextbox.sendKeys(address);
	}

	public void enterCity(String city) {
		cityTextbox.sendKeys(city);
	}

	public void enterState(String state) {
		stateTextbox.sendKeys(state);
	}

	public void enterPostalCode(String postalCode) {
		postalCodeTextbox.sendKeys(postalCode);
	}

	public void selectCountry(String country) {
		Select selectCountry = new Select(countryList);
		countryList.click();
		selectCountry.selectByVisibleText(country);
	}

	public void enterEmailId(String email) {
		emailTextbox.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordTextbox.sendKeys(password);
	}

	public void enterConfirmPassword(String password) {
		confirmPasswordTextbox.sendKeys(password);
	}

	public void clickOnSubmitButton() {
		registerButton.click();
	}

}
