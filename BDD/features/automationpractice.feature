@automation
Feature: Feature For Automation Practice

  @automationPractice
  Scenario Outline: Automation Practice by Filling a Form
    Given User is navigated to the website
    Then User click on SignIn button
    Then User enter a valid email id as "<emailId>"
    And User click on create account button
    Then User validates the registration page
    Then User selects the title radio button
    Then User enters the firstName as "<firstName>"
    Then User enters the lastName as "<lastName>"
    Then User enters the password "<password>"
    Then User selects day as "<day>" , month as "<month>" and year as "<year>"
    Then User enters address "<address>"
    Then User enters city as "<city>"
    Then User select country as "<country>"
    Then User select state as "<state>"
    Then User enter postalCode as "<postalCode>"
    Then User enter mobile number as "<mobile>"
    Then User clicks on register button
    And User validates successful registration

    Examples: 
      | emailId          | firstName | lastName | password   | day | month | year | address | city | country       | state | postalCode | mobile     |
      | sahil@gmail.com  | sahil     | dash     | Asdqwe@123 |  19 |     8 | 1995 | ORI     | BBS  | United States | Texas |      99999 | 9438211545 |
      | sudesh@gmail.com | sudesh    | kara     | Qwe123@123 |  18 |     9 | 1997 | BAR     | ASD  | United States | Texas |      66666 | 9437557355 |
      | manash@gmail.com | manash    | dash     | Asdzxc@123 |  21 |     2 | 1996 | QWE     | ZXC  | United States | Texas |      33333 | 8895321455 |
