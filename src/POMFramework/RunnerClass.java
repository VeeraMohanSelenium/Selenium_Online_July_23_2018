package POMFramework;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RunnerClass extends GenericVariables{

	@Test
	public void TC101()
	{
		driver = new FirefoxDriver();
		
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		Pages runnertest = PageFactory.initElements(driver, Pages.class);
		runnertest.loginhome();
		
	}
	
	
}
