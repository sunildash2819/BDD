package pagemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageelements.AutomationPracticePageElements;

public class AutomationPracticePageMethods extends AutomationPracticePageElements {

	public AutomationPracticePageMethods(WebDriver driver) {
		super(driver);
	}

	public void clickOnSignInButton() {
		signInButton.click();
	}

	public void enterEmailAddress(String emailId) {
		emailTextbox.sendKeys(emailId);
	}

	public void clickOnCreateAccountButton() {
		createAccountButton.click();
	}

	public void validateRegistrationPage() {
		String text = registrationPageTitle.getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("Create an account"));
	}

	public void selectTitleRadioButton() {
		titleRadioButton.click();
	}

	public void enterFirstName(String firstname) {
		firstNameTextbox.sendKeys(firstname);
	}

	public void enterLastName(String lastname) {
		lastNameTextbox.sendKeys(lastname);
	}

	public void enterPassword(String password) {
		passwordTextbox.sendKeys(password);
	}

	public void selectDateOfBirth(String day, int month, String year) {
		Select selectDay = new Select(days);
		days.click();
		selectDay.selectByValue(day);

		Select selectMonth = new Select(months);
		months.click();
		selectMonth.selectByIndex(month);

		Select selectYear = new Select(years);
		years.click();
		selectYear.selectByValue(year);
	}

	public void enterAddress(String address) {
		addressTextbox.sendKeys(address);
	}

	public void enterCity(String city) {
		cityTextbox.sendKeys(city);
	}

	public void selectCountry(String country) {
		Select selectCountry = new Select(countries);
		selectCountry.selectByVisibleText(country);
	}

	public void selectState(String state) {
		Select selectState = new Select(states);
		selectState.selectByVisibleText(state);
	}

	public void enterPostalCode(String postalcode) {
		postalcodeTextbox.sendKeys(postalcode);
	}

	public void enterMobileNumber(String mobileNumber) {
		mobileNumberTextbox.sendKeys(mobileNumber);
	}

	public void clickOnRegisterButton() {
		registerButton.click();
	}

	public void validateSuccessfulRegistration() {
		String text = myAccount.getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("My account"));
	}
}
