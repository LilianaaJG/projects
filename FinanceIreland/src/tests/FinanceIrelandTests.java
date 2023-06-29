package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import core.DriverFactory;
import pages.Calculator;


public class FinanceIrelandTests extends DriverFactory{ 
	
	Calculator calculator = null;
	
	@BeforeTest
	public void cookies () {
		
		calculator = new Calculator(getDriver("chrome"));
		Assert.assertEquals(calculator.launchHome("https://fin.uat.mybrand.finance/?ag=GG01&supplier=A1D2"), true, "Unable to reach FI Home");
		calculator.cookies();	
	}
		
	@Test
	public void Simulation_Loan () {
		
		calculator.simulation("15000", 3, "10000", "2000", "1000", "40000", "3500","200", "500");
		
		/*result = new SearchResult(getDriver("chrome"));
		Assert.assertEquals(result.ifSearchResultDisplayed(), true, "Unable to reach Flight Search Result page");
		result.selectFlight();*/
		
	}
	
	
}