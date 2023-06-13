package christianlovetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import browserfactory.BrowserFactory;
import christianlove.HomePage;

public class hometest {
WebDriver driver;
	String gender="female";
    String gendersort= "male";
    String birthyear1= "30";
    String birthyear2= "50";
    @Test
	
	public void ValiduserShouldBeAbleTofillTheForm() {
		//by name of the class
		driver = BrowserFactory.init();
		HomePage homePage = new HomePage();
		HomePage homePage1 = PageFactory.initElements(driver, HomePage.class);
        homePage1.gender("male");
		homePage1.gendersort("female");
		homePage.birthyear1("30");
		homePage.birthyear2();




    }
}
