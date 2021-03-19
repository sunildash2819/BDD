package assignmentsstepdefs;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import reusuableutilies.Driver;

public class Hooks extends Driver {
	@Before("@AirAsia")
	public void airAsiaSetup(Scenario scenario)
	{
		setup();
		Reporter.addScenarioLog(scenario.getName()+" Execution Started");
	}
	@After("@AirAsia")
	public void airAsiaTeardown(Scenario scenario)
	{
		teardown();
		Reporter.addScenarioLog(scenario.getName()+" Execution Finished");
	}
	@Before("@automationPractice")
	public void automationPracticeSetup(Scenario  scenario)
	{
		setup();
		driver.get("http://automationpractice.com/index.php");
		Reporter.addScenarioLog(scenario.getName()+" Execution Started");
	}
	@After("@automationPractice")
	public void automationPracticeTeardown(Scenario  scenario)
	{
		teardown();
		Reporter.addScenarioLog(scenario.getName()+" Execution Finished");
	}
	@Before("@travel")
	public void demoflightRegistrationSetup(Scenario  scenario)
	{
		setup();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		Reporter.addScenarioLog(scenario.getName()+" Execution Started");
	}
	@After("@travel")
	public void demoflightRegistrationTeardown(Scenario  scenario)
	{
		teardown();
		Reporter.addScenarioLog(scenario.getName()+" Execution Finished");
	}
}
