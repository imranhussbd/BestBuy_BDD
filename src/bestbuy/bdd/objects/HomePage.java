package bestbuy.bdd.objects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bestbuy.bdd.commons.Commons;



public class HomePage {
	WebDriver driver;
	Commons commons;

	public HomePage(WebDriver driver, Commons commons) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.commons = commons;

	}

	@FindBy(id = "gh-search-input")
	WebElement searchElement;

	@FindBy(className ="header-search-button")
	WebElement searchButtonElement;

	@FindBy(xpath = "//a[text() = 'Shop Featured PS5']")
	WebElement shopFtP5ButtonElement;
	
	@FindBy(xpath = "//span[text()='Account']")
	WebElement accountElement;
	
	@FindBy(xpath = "//a[text()='Create Account']")
	WebElement createAccElement;
	
	public void getTitle() {
		commons.getTitle(driver);
	}

	public void inputSearch(String value) {
		commons.inputValues(searchElement, value);
	}

	public void clickSearch() {
	commons.click(searchButtonElement);
	}

	public void clickShopFtPs5() {
		commons.click(shopFtP5ButtonElement);
	}
	
	public void clickAccount() {
		commons.click(accountElement);
	}
	
	public void clickCreateAcc() {
		commons.click(createAccElement);
	}

	/*public void homepageSteps(String expectedTitle, String value) {
		getTitle(expectedTitle);
		inputSearch(value);
		clickSearch();
		clickShopFtPs5();
	}*/
	
	public void homepageSteps(String value) {
		inputSearch(value);
		clickSearch();
		clickShopFtPs5();
	}
	
	public void homepageAccountSteps() {
		clickAccount();
		clickCreateAcc();
		
	}
}
