package assignmentsstepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagemethods.TravelsPageMethods;
import reusuableutilies.Driver;

public class TravelsStepDefs extends Driver {
	
	TravelsPageMethods objTravels=new TravelsPageMethods(driver);
	
	@Given("^User is navigate to the website$")
	public void user_is_navigate_to_the_website() throws Throwable {
		String title = driver.getTitle();
		System.out.println("Title : " + title);
	}

	@When("^User click on the register button$")
	public void user_click_on_the_register_button() throws Throwable {
		objTravels.clickOnRegisterOption();
	}

	@Then("^User enter first name as \"([^\"]*)\"$")
	public void user_enter_first_name_as(String firstName) throws Throwable {
		objTravels.enterFirstName(firstName);
	}

	@Then("^User enter last name as \"([^\"]*)\"$")
	public void user_enter_last_name_as(String lastName) throws Throwable {
		objTravels.enterLastName(lastName);
	}

	@Then("^User enter phone number as \"([^\"]*)\"$")
	public void user_enter_phone_number_as(String phone) throws Throwable {
		objTravels.enterPhoneNumber(phone);
	}

	@Then("^User enter email as \"([^\"]*)\"$")
	public void user_enter_email_as(String username) throws Throwable {
		objTravels.enterUsername(username);
	}

	@Then("^User enter address as \"([^\"]*)\"$")
	public void user_enter_address_as(String address) throws Throwable {
		objTravels.enterAddress(address);
	}

	@Then("^User enter city as \"([^\"]*)\"$")
	public void user_enter_city_as(String city) throws Throwable {
		objTravels.enterCity(city);
	}

	@Then("^User enter state as \"([^\"]*)\"$")
	public void user_enter_state_as(String state) throws Throwable {
		objTravels.enterState(state);
	}

	@Then("^User enter postal code as \"([^\"]*)\"$")
	public void user_enter_postal_code_as(String postalCode) throws Throwable {
		objTravels.enterPostalCode(postalCode);
	}

	@Then("^User select counrtry as \"([^\"]*)\"$")
	public void user_select_counrtry_as(String country) throws Throwable {
		objTravels.selectCountry(country);
	}

	@Then("^User enter username as \"([^\"]*)\"$")
	public void user_enter_username_as(String email) throws Throwable {
		objTravels.enterEmailId(email);
	}

	@Then("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String password) throws Throwable {
		objTravels.enterPassword(password);
	}

	@Then("^User confirm password as \"([^\"]*)\"$")
	public void user_confirm_password_as(String password) throws Throwable {
		objTravels.enterConfirmPassword(password);
	}

	@Then("^User click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		objTravels.clickOnSubmitButton();
	}

}
