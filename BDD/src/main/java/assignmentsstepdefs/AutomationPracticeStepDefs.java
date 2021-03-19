package assignmentsstepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pagemethods.AutomationPracticePageMethods;
import reusuableutilies.Driver;

public class AutomationPracticeStepDefs extends Driver{
	
	AutomationPracticePageMethods objAutomationPractice = new AutomationPracticePageMethods(driver);
	
	@Given("^User is navigated to the website$")
	public void user_is_navigated_to_the_website() throws Throwable {
	    String title=driver.getTitle();
	    System.out.println(title);
	}

	@Then("^User click on SignIn button$")
	public void user_click_on_SignIn_button() throws Throwable {
	    objAutomationPractice.clickOnSignInButton();
	}

	@Then("^User enter a valid email id as \"([^\"]*)\"$")
	public void user_enter_a_valid_email_id_as(String emailId) throws Throwable {
	   objAutomationPractice.enterEmailAddress(emailId);
	}

	@Then("^User click on create account button$")
	public void user_click_on_create_account_button() throws Throwable {
	    objAutomationPractice.clickOnCreateAccountButton();
	}

	@Then("^User validates the registration page$")
	public void user_validates_the_registration_page() throws Throwable {
	   objAutomationPractice.validateRegistrationPage();
	}

	@Then("^User selects the title radio button$")
	public void user_selects_the_title_radio_button() throws Throwable {
	    objAutomationPractice.selectTitleRadioButton();
	}

	@Then("^User enters the firstName as \"([^\"]*)\"$")
	public void user_enters_the_firstName_as(String firstName) throws Throwable {
	    objAutomationPractice.enterFirstName(firstName);
	}

	@Then("^User enters the lastName as \"([^\"]*)\"$")
	public void user_enters_the_lastName_as(String lastName) throws Throwable {
		objAutomationPractice.enterLastName(lastName);
	}

	@Then("^User enters the password \"([^\"]*)\"$")
	public void user_enters_the_password(String password) throws Throwable {
		objAutomationPractice.enterPassword(password);
	}

	@Then("^User selects day as \"([^\"]*)\" , month as \"([^\"]*)\" and year as \"([^\"]*)\"$")
	public void user_selects_day_as_month_as_and_year_as(String day, int month, String year) throws Throwable {
	   objAutomationPractice.selectDateOfBirth(day, month, year);
	}

	@Then("^User enters address \"([^\"]*)\"$")
	public void user_enters_address(String address) throws Throwable {
	    objAutomationPractice.enterAddress(address);
	}

	@Then("^User enters city as \"([^\"]*)\"$")
	public void user_enters_city_as(String city) throws Throwable {
		objAutomationPractice.enterCity(city);
	}

	@Then("^User select country as \"([^\"]*)\"$")
	public void user_select_country_as(String country) throws Throwable {
	    objAutomationPractice.selectCountry(country);
	}

	@Then("^User select state as \"([^\"]*)\"$")
	public void user_select_state_as(String state) throws Throwable {
		 objAutomationPractice.selectState(state);
	}

	@Then("^User enter postalCode as \"([^\"]*)\"$")
	public void user_enter_postalCode_as(String postalcode) throws Throwable {
		objAutomationPractice.enterPostalCode(postalcode);
	}

	@Then("^User enter mobile number as \"([^\"]*)\"$")
	public void user_enter_mobile_number_as(String mobile) throws Throwable {
		objAutomationPractice.enterMobileNumber(mobile);
	}

	@Then("^User clicks on register button$")
	public void user_clicks_on_register_button() throws Throwable {
	    objAutomationPractice.clickOnRegisterButton();
	}

	@Then("^User validates successful registration$")
	public void user_validates_successful_registration() throws Throwable {
		objAutomationPractice.validateSuccessfulRegistration();
	}
}
