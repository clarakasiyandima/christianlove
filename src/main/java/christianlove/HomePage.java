package christianlove;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
	WebDriver driver;
	
	@FindBy(how = How.XPATH,using = "/html/body/div[4]/div[1]/div[2]/h1")WebElement HOME_HEADER_ELEMENT;
	@FindBy(how= How.XPATH,using= "//*[@id=\"node-1\"]/div[2]")WebElement CONTENT_ELEMENT;
	@FindBy(how = How.XPATH,using = "//*[@id=\"userdata-search-block-form\"]/div/fieldset/legend/a")WebElement MEMBER_SEARCH_ELEMENT;
    @FindBy(how= How.XPATH,using = "//*[@id=\"edit-gender\"]")WebElement GENDER_ELEMENT;
    @FindBy(how= How.XPATH,using = "//*[@id=\"edit-gender-sort\"]")WebElement GENDER_SORT_ELEMENT;
    @FindBy(how= How.XPATH,using = "//*[@id=\"edit-birth-year1\"]")WebElement BIRTH_YEAR1_ELEMENT;
    @FindBy(how= How.XPATH,using = "//*[@id=\"edit-birth-year2\"]")WebElement BIRTH_YEAR2_ELEMENT;
    
    
	public void validateHomePage() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(MEMBER_SEARCH_ELEMENT));
		Assert.assertEquals(MEMBER_SEARCH_ELEMENT.getText()," Member search", "Member search page not found!!!");
		waitForElement(driver, 5,MEMBER_SEARCH_ELEMENT);
		
		
	}

	private void waitForElement(WebDriver driver2, int i, WebElement hOME_HEADER_ELEMENT2) {
		// TODO Auto-generated method stub
		
	}
public void gender(String gender) {
	selectFromDropDown(GENDER_ELEMENT,gender);
}
private void selectFromDropDown(WebElement gENDER_ELEMENT2, String gender) {
	// TODO Auto-generated method stub
	
}

public void gendersort(String gendersort) {
	selectFromDropDown(GENDER_SORT_ELEMENT, gendersort);
}
public void birthyear1(String birthyear1) {
selectFromDropDown(BIRTH_YEAR1_ELEMENT,birthyear1);
}
public void birthyear2() {
	BIRTH_YEAR2_ELEMENT.sendKeys("50");
}
}
