package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestngParameter {

	WebDriver driver;
	
	@Test
	@Parameters("Browser")
	public void launchApplication(String browser)
	{
		switch (browser) {
		case "ff":
			driver=new FirefoxDriver();
			
			driver.get("http://testingmasters.com/wp-content/uploads/latest-selenium.pdf");
			break;

		default:
			
			System.out.println("Please pass the valid browser name");
			break;
		}
		
		
		
	}
	
}
