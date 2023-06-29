package pages;

import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath=".//button[@class='dropdown-item']")
	private List<WebElement> buttonSelectList;
	
	@FindBy(xpath=".//button[@id='goNext']")
	private WebElement next;
	
	@FindBy(xpath=".//input[@id='custom']")
	private WebElement custom;
	
	@FindBy(xpath=".//button[@id='nextButton']")
	private WebElement nextButton;
	
	@FindBy(xpath=".//input[@id='mortgageValue']")
	private WebElement mortgageValue;
	
	//@FindBy(className("pf-card-change"))
	@FindBy(xpath=".//div[@class='pf-container-elibility-loan-edit']/a")
	private WebElement edit;
	
	//private WebElement searchField = By.className("pf-card-change");
	
	//driver.findElement(By.className("pf-card-change")).click();	
	
	private WebDriver driver = null;
		
	
	public Calculator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean launchHome(String URL) {
		driver.get(URL);
		return true;
	}
	
	public void cookies() {
		
		try {
			
			cookies.click();
			
		} catch (Exception e) {
			cookies.click();
		}
	}
	
	public void simulation(String loan, int year, String loanAmountSupplier, String additionalLoanAmount, String mortgage, String anualIncome, String monthlyIncome, String additionalIncome, String personalLoan) {
		
		try {
			loanCustomer.click();
			loanCustomer.sendKeys(loan);
			years.click();
			buttonSelectList.get(year).click();
		
			Thread.sleep(800);
		
			next.click();
			
			custom.sendKeys(loanAmountSupplier);
			
			//Thread.sleep(800);
			
			nextButton.click();
			
			custom.sendKeys(additionalLoanAmount);
			
			nextButton.click();
			
			Thread.sleep(800);
			
			nextButton.click();
			
			years.click();
			
			buttonSelectList.get(0).click();
			
			nextButton.click();
			
			mortgageValue.click();
			mortgageValue.sendKeys(mortgage);
			
			nextButton.click();
			
			custom.click();
			custom.sendKeys (anualIncome);
			
			nextButton.click();
			
			custom.click();
			custom.sendKeys (monthlyIncome);
			
			nextButton.click();
			
			custom.click();
			custom.sendKeys (additionalIncome);
			
			nextButton.click();
			
			custom.click();
			custom.sendKeys (personalLoan);
			
			nextButton.click();
			
			edit.click();
		
		} catch (Exception e) {
			
		}
	}

}
