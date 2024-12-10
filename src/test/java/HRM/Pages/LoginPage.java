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
	String applicationUrl="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	String user1="Admin";
	String correctpassword="admin123";

	String userName="//input[@name='username']";
	String password="//input[@name='password']";
	String logInButton="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']";


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

