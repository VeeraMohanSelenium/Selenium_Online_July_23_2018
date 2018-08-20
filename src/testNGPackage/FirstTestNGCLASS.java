package testNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGCLASS {
	
	@BeforeMethod
	public void launchingApplication()
	{
		System.out.println("LaunchingApplication");
	}
	
	
	@AfterMethod
	public void close()
	{
		System.out.println("close");
	}

	
	@Test
	public void TC101OrangeHRM()
	{
		System.out.println("apply leave in Orange HRM");
	}
	
	@Test
	public void TC102Facebook()
	{
		System.out.println("Send the Request To friends");
	}
	
	
	
}
