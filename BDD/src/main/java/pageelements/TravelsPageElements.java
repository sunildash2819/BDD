package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TravelsPageElements {

	public WebDriver driver;
	public TravelsPageElements(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'REGISTER')]")
	protected WebElement registerOption;
	
	@FindBy(name="firstName")
	protected WebElement firstNameTextbox;
	
	@FindBy(name="lastName")
	protected WebElement lastNameTextbox;
	
	@FindBy(name="phone")
	protected WebElement phoneNumberTextbox;
	
	@FindBy(name="userName")
	protected WebElement usernameTextbox;
	
	@FindBy(name="address1")
	protected WebElement addressTextbox;
	
	@FindBy(name="city")
	protected WebElement cityTextbox;
	
	@FindBy(name="state")
	protected WebElement stateTextbox;
	
	@FindBy(name="postalCode")
	protected WebElement postalCodeTextbox;
	
	@FindBy(name="country")
	protected WebElement countryList;
	
	@FindBy(name="email")
	protected WebElement emailTextbox;
	
	@FindBy(name="password")
	protected WebElement passwordTextbox;
	
	@FindBy(name="confirmPassword")
	protected WebElement confirmPasswordTextbox;
	
	@FindBy(name="register")
	protected WebElement registerButton;
}
