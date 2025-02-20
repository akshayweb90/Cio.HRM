package StepDefinations;




import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import PageActions.PageAction;
import PageObjectManger.PageObjectManger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefination extends PageAction {
	
	@Given("I am in backGround")
	public void i_am_in_back_ground() {
	    System.out.println("i am in background");
	}
	
	PageObjectManger pageObjectManger;
	public LoginPageStepDefination(){
		startDriver();
		pageObjectManger=new PageObjectManger(driver);
	}
	@Given("user is on login Page")
	public void user_is_on_login_page()   {
		
		pageObjectManger.getLoginPage().hitUrl();
}
	@When("User gives the credential")
	public void user_gives_the_credential()  {
		pageObjectManger.getLoginPage().loginHRM();
	}
	@Then("user is on dashboard")
	public void user_is_on_dashboard() {
		pageObjectManger.getHomePage().validateUserIsOnDasBoard();
	}
	@When("User click om logout button")
	public void user_click_om_logout_button() {
		getElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();
}

	@Then("user is logged out")
	public void user_is_logged_out() {
		getElement("//a[contains(text(),'Logout')]").click();
		Boolean LoginPageIcon=getElement(By.xpath("//h5")).isDisplayed();
		assertTrue(LoginPageIcon);
	}
	@Then("^user enters(.*)and(.*)$")
	public void user_enters_akshay_and_gadhave(String username,String passward) {
		WebElement username1=getElement("//input[@name=\"username\"]");
		username1.sendKeys(username);
		WebElement Passward1=getElement(By.xpath("//input[@name=\"password\"]"));
		Passward1.sendKeys(passward);
		getElement("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']").click();
	}

	@Then("invalid credential sms should displayed")
	public void invalid_credential_sms_should_displayed() {

	}





}
