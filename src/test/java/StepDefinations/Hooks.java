package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import PageActions.PageAction;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
public class Hooks extends PageAction{

	@Before
	public void beforeScenario() {
		System.out.println("before sceanrio");
	}
	@After
	public void afterSceanrio(Scenario s ) {
		if(s.isFailed()) {

			TakesScreenshot ts=(TakesScreenshot)getDriver();
			File screenshot=ts.getScreenshotAs(OutputType.FILE);
			try {

				FileUtils.copyFile(screenshot, new File("C:\\Users\\AKGADHAV\\git\\Cio.HRM\\test-output\\Screenshots\\"+s.getName().replace(" ", "_")+System.currentTimeMillis()+".png"));

			} catch (IOException e) {

				e.printStackTrace();
			}

		}

		System.out.println("after sceanrio");
		getDriver().quit();
	}
	@BeforeStep
	public void beforeStep() {
		System.out.println("before step");
	}
	@AfterStep
	public void afterStep() {
		System.out.println("After Step");
	}
	@BeforeAll
	public static void beforeAll() {
		System.out.println("before All");
	}
	@io.cucumber.java.AfterAll 
	public static void AfterAll() {
		System.out.println("after All");
	}

}
