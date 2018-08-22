package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGDepencencys {
	
	WebDriver driver;
	@Test(priority=2)
	public void Launch_Application()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Test(priority=1,dependsOnMethods="Launch_Application")
	public void EnterUsername()
	{
		driver.findElement(By.id("email")).sendKeys("Hello");
	}
	@Test(dependsOnMethods="EnterUsername",priority=3)
	public void Close()
	{
		driver.close();
	}
}
