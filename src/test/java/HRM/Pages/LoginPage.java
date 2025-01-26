package HRM.Pages;

import org.openqa.selenium.WebDriver;
import PageActions.PageAction;

public class LoginPage extends PageAction {
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	//String applicationUrl="https://www.youtube.com/";
	//String applicationUrl="https://www.javatpoint.com/collections-in-java";
	String applicationUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String user1="Admin";
	String correctpassword="admin123";

	String userName="//input[@placeholder='Username']";
	String password="//input[@placeholder='Password']";
	String logInButton="//button[@type='submit']";


	public void hitUrl()  {
		getDriver().get(applicationUrl);
		getDriver().manage().window().maximize();
		
			
	}
	public HomePage loginHRM () {
//		getDriver().findElement(userName).sendKeys(user1);
//		getDriver().findElement(password).sendKeys(correctpassword);
//		getDriver().findElement(logInButton).click();
		setInput(userName, user1);
		setInput(password, correctpassword);
		clickElement(logInButton);
		
		return new HomePage(driver);
	}
	
	
	
}

