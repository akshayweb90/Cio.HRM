package StepDefinations;

import PageActions.PageAction;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends PageAction{
	
	@Before
	public void beforeScenario() {
		System.out.println("before sceanrio");
	}
	@After
	public void afterSceanrio() {
		getDriver().quit();
	}
}
