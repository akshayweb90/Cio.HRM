package RunnerClass;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src\\test\\resources\\feature"},
		glue = "StepDefinations"

		,tags="@HRM"

		)
public class MyRunner extends  AbstractTestNGCucumberTests  {
	
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	
	}


}
