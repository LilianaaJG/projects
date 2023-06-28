package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Calculator {
	
	// Home Page Web Elements
	@FindBy(xpath=".//button[text()='Accept All']")
	private WebElement cookies;


	@FindBy(xpath=".//input[@formcontrolname='amount']")
	private WebElement loanCustomer;
	
	@FindBy(xpath=".//button[@id='dropdownBasic']")
	private WebElement years;
	
	
	private WebDriver driver = null;
		
	
	public Calculator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean launchHome(String URL) {
		driver.get(URL);
		//return flightTab.isDisplayed();
		return true;
	}
	
	public void simulation(String loan, String term) {
		
		try {
		
		System.out.println("here1");
		
		boolean isNameHtmlElementStale = ExpectedConditions.stalenessOf(cookies).apply(driver);

		// if the element is stale
	//	if (isNameHtmlElementStale) {
		    // re-retrieving the desired input HTML element
			cookies.click();
	//	}
		
		//timer
		
		System.out.println("here");
		//loanCustomer.click();
		//loanCustomer.sendKeys(loan);
		//years.click();
		//years.sendKeys(Keys.ARROW_DOWN);
		//oneWayFlightTab.click();
		//flightOrigin.sendKeys(origin);
		//flightDestination.sendKeys(destination);
		//flightOriginCalendar.sendKeys(date);
		//flightOriginCalendar.sendKeys(Keys.ENTER);
		
		} catch (Exception e) {
			cookies.click();
			loanCustomer.click();
			loanCustomer.sendKeys(loan);
			years.click();
			years.sendKeys("5 Years");
		}
	}

}
