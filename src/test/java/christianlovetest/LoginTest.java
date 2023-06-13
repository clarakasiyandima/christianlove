package christianlovetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import browserfactory.BrowserFactory;
import christianlove.HomePage;
import christianlove.LoginPage;

public class LoginTest{
	WebDriver driver;
	String userName="claris";
    String password= "Takudzwajena2012#";
    
    @Test
	
	public void ValiduserShouldBeAbleToLogin() {
		//by name of the class
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUsername(userName);
		loginPage.insertPassword(password);
		loginPage.login(userName, password);
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.validateHomePage();
		//BrowserFactory.tearDown();
	}

}
