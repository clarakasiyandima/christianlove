package christianlove;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	public  LoginPage() {
		
	}
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//WebElement
	//intractable
	@FindBy(how = How.XPATH,using = "//*[@id=\"edit-name\"]")WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH,using = "//*[@id=\"edit-pass\"]")WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH,using = "//*[@id=\"edit-submit-1\"]")WebElement LOGIN_BUTTON_ELEMENT;
//Individual methods
	
	
	
	//COMBINE
	public void login(String userName,String password) {
		USER_NAME_ELEMENT.sendKeys("claris");
		PASSWORD_ELEMENT.sendKeys("Takudzwajena2012#");
		LOGIN_BUTTON_ELEMENT.click();
		
	}
	public void insertUsername(String userName) {
		// TODO Auto-generated method stub
		
	}
	public void insertPassword(String password) {
		// TODO Auto-generated method stub
		
	}
}
