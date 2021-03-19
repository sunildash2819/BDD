package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AirAsiaPageElements {
	
	public WebDriver driver;
	public AirAsiaPageElements(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//button[p[contains(text(),'Find flights')]]")
	protected WebElement flighticon;
	
	@FindBy(xpath="//div[label[contains(text(),'Origin ')]]/input")
	protected WebElement origin;
	
	@FindBy(xpath="//div[label[contains(text(),'Destination ')]]/input")
	protected WebElement destination;
	
	@FindBy(id="home-depart-date-heatmap")
	protected WebElement departDate;
	
	@FindBy(xpath="//label[@for='trip-oneway']")
	protected WebElement oneway;
	
	@FindBy(xpath="//button[contains(text(),' Search ')]")
	protected WebElement searchButton;
	
	@FindBy(id="loginModal")
	protected WebElement siginInOption;
	
	@FindBy(id="sso-login-email-input")
	protected WebElement usernameTextbox;
	
	@FindBy(id="sso-login-password-input")
	protected WebElement passwordTextbox;
	
	@FindBy(xpath="//button[contains(text(),' Log in ')]")
	protected WebElement loginButton;
	
	@FindBy(xpath="//div[@class='sso-error-message ng-star-inserted']/div")
	protected WebElement errorMessage;	
	
}
