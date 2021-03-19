package assignmentsstepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagemethods.AirAsiaPageMethods;
import reusuableutilies.Driver;

public class AirAsiaStepDefs extends Driver {
	
	AirAsiaPageMethods objAirAsiaPageMethods=new AirAsiaPageMethods(driver);
	
	@Given("^User is navigated successfully to the website$")
	public void user_is_navigated_successfully_to_the_website() throws Throwable {
	    driver.get("https://www.airasia.com/en/home.page");
	}

	@Given("^User Verify its Title$")
	public void user_Verify_its_Title() throws Throwable {
	    String title=driver.getTitle();
	    System.out.println("Website Title : "+title);
	    Thread.sleep(5000);
	}

	@When("^Click on Flights Icon$")
	public void click_on_Flights_Icon() throws Throwable {		
	    objAirAsiaPageMethods.clickOnFlightIcon();
	}
	
	@When("^Enter origin as \"([^\"]*)\"$")
	public void enter_origin_as(String origin) throws Throwable {
	    objAirAsiaPageMethods.enterOrigin(origin);
	}

	@When("^Enter Destination as \"([^\"]*)\"$")
	public void enter_Destination_as(String destination) throws Throwable {
	  objAirAsiaPageMethods.enterDestination(destination);
	}

	@Then("^Select depart date as \"([^\"]*)\"$")
	public void select_depart_date_as(String departdate) throws Throwable {
	   objAirAsiaPageMethods.enterDepartDate(departdate);
	}

	@Then("^Select return date as \"([^\"]*)\"$")
	public void select_return_date_as(String oneway) throws Throwable {
	    objAirAsiaPageMethods.clickOnOneWay(oneway);
	}				

	@Then("^Click on Search Button$")
	public void click_on_Search_Button() throws Throwable {
	    objAirAsiaPageMethods.clickOnSearchButton();
	}

	@Then("^Verify that user navigated successfully to search flight page$")
	public void verify_that_user_navigated_successfully_to_search_flight_page() throws Throwable {
	   String title= driver.getTitle();
	   System.out.println("Title of search flight page : "+title);
	}
	@Then("^User click on Login/Signup Button$")
	public void user_click_on_Login_Signup_Button() throws Throwable {
	    objAirAsiaPageMethods.clickOnSignInOption();
	}

	@Then("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable {
	   objAirAsiaPageMethods.enterUsernameInTextbox(username);
	}

	@Then("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		objAirAsiaPageMethods.enterPasswordInTextbox(password);
	}

	@When("^User clicks on log in button$")
	public void user_clicks_on_log_in_button() throws Throwable {
	    objAirAsiaPageMethods.clickOnLoginButton();
	}

	@Then("^User is not able to signin and verifies the error message \"([^\"]*)\"$")
	public void user_is_not_able_to_signin_and_verifies_the_error_message(String message) throws Throwable {
	    objAirAsiaPageMethods.validateErrorMessage(message);
	}

}
