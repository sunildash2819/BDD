package pagemethods;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageelements.AirAsiaPageElements;

public class AirAsiaPageMethods extends AirAsiaPageElements{

	public AirAsiaPageMethods(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnFlightIcon()
	{
		WebDriverWait wait=new WebDriverWait(driver, 5);
	    wait.until(ExpectedConditions.elementToBeClickable(flighticon));
		flighticon.click();
	}
	public void enterOrigin(String originName) throws Exception
	{
		origin.sendKeys(originName);
		Thread.sleep(3000);
		origin.sendKeys(Keys.ENTER);
	}
	public void enterDestination(String destinationName) throws Exception
	{
		destination.sendKeys(destinationName);
		Thread.sleep(3000);
		destination.sendKeys(Keys.ENTER);
	}
	public void enterDepartDate(String departdate) throws Exception
	{
		departDate.clear();
		departDate.sendKeys(departdate);
		Thread.sleep(3000);
	}
	public void clickOnOneWay(String oneWay) throws Exception
	{
		oneway.click();
	    Thread.sleep(3000);
	    Robot robot=new Robot();
	    Thread.sleep(2000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	public void clickOnSignInOption()
	{
		siginInOption.click();
	}
	public void enterUsernameInTextbox(String username)
	{
		usernameTextbox.sendKeys(username);
	}
	public void enterPasswordInTextbox(String password)
	{
		passwordTextbox.sendKeys(password);
	}
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	public void validateErrorMessage(String message)
	{
		System.err.println(errorMessage.getText());
	    System.err.println(message);
	    Assert.assertTrue(errorMessage.getText().contains(message));
	}
	
}
