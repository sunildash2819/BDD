@AirAsia
Feature: Flight Search on AirAsia.

  @flight
  Scenario: Searching a One Way Flight.
    Given User is navigated successfully to the website
    And User Verify its Title
    When Click on Flights Icon
    And Enter origin as "Bengaluru"
    And Enter Destination as "Pune"
    Then Select depart date as "15/12/2019"
    And Select return date as "One Way"
		Then Click on Search Button
		And Verify that user navigated successfully to search flight page

@login
Scenario: Login to AirAsia.
Given User is navigated successfully to the website		
And User Verify its Title
Then User click on Login/Signup Button
Then User enters username as "a@gmail.com"
And User enters password as "India1234"
When User clicks on log in button
Then User is not able to signin and verifies the error message "Your log in attempts has been unsuccessful."