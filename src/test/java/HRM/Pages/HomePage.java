package HRM.Pages;

import org.openqa.selenium.WebDriver;

import PageActions.PageAction;

public class HomePage extends PageAction{
	
	public HomePage(WebDriver driver){
		
	}
	public void validateUserIsOnDasBoard() {
		getElement("//img[@alt='profile picture']").isDisplayed();;
	}


}
