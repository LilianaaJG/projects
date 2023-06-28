package tests;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;
import core.DriverFactory;
import pages.Calculator;
//import pages.SearchResult;

public class FinanceIrelandTests extends DriverFactory{ 
	
	Calculator calculator = null;
	//SearchResult result = null;
	
	@Test
	public void Verify_Continue_Boooking_Screen_for_One_Way_Flight_Sreach() {
		calculator = new Calculator(getDriver("chrome"));
		Assert.assertEquals(calculator.launchHome("https://fin.uat.mybrand.finance/?ag=GG01&supplier=A1D2"), true, "Unable to reach FI Home");
		
		
				
		calculator.simulation("15000", "4 Years");
		
		/*result = new SearchResult(getDriver("chrome"));
		Assert.assertEquals(result.ifSearchResultDisplayed(), true, "Unable to reach Flight Search Result page");
		result.selectFlight();*/
		
	}
	
	
}