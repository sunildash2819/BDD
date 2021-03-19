package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AutomationPracticePageElements {
	
	public WebDriver driver;
	public AutomationPracticePageElements(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	protected WebElement signInButton;
	
	@FindBy(id="email_create")
	protected WebElement emailTextbox;
	
	@FindBy(id="SubmitCreate")
	protected WebElement createAccountButton;
	
	@FindBy(xpath="//h1[contains(text(),'Create an account')]")
	protected WebElement registrationPageTitle;
	
	@FindBy(id="id_gender1")
	protected WebElement titleRadioButton;
	
	@FindBy(id="customer_firstname")
	protected WebElement firstNameTextbox;
	
	@FindBy(id="customer_lastname")
	protected WebElement lastNameTextbox;
	
	@FindBy(id="passwd")
	protected WebElement passwordTextbox;
	
	@FindBy(id="days")
	protected WebElement days;
	
	@FindBy(id="months")
	protected WebElement months;
	
	@FindBy(id="years")
	protected WebElement years;
	
	@FindBy(id="address1")
	protected WebElement addressTextbox;
	
	@FindBy(id="city")
	protected WebElement cityTextbox;
	
	@FindBy(id="id_country")
	protected WebElement countries;
	
	@FindBy(id="id_state")
	protected WebElement states;
	
	@FindBy(id="postcode")
	protected WebElement postalcodeTextbox;
	
	@FindBy(id="phone_mobile")
	protected WebElement mobileNumberTextbox;
	
	@FindBy(xpath="//span[contains(text(),'Register')]")
	protected WebElement registerButton;
	
	@FindBy(xpath="//h1[contains(text(),'My account')]")
	protected WebElement myAccount;	
}
