package core;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private WebDriver driver = null;
	
	
	public WebDriver getDriver(String browser) {	
		switch(browser.toLowerCase()) {
			case "chrome"  : 
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\lilia\\OneDrive\\Documentos\\Selenium\\chromedriver.exe");
				//C:\Users\lilia\OneDrive\Documentos\Selenium
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				
				
				driver = new ChromeDriver(options);
				break;
				
			case "firefox" :
				driver = new FirefoxDriver();
			default : System.out.println("Incorrect browser name provided "+ browser);
				
		}
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		return driver;	
	}
	
	public void quitDriver() {
		if(driver!=null) {
			driver.quit();
		}
	}

}