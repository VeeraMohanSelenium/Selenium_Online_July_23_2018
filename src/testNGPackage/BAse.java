package testNGPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BAse {
	@BeforeMethod
	public void launching() {
		System.out.println("launching application");
	}
	@AfterMethod
	public void CloseApp()
	{
		System.out.println("Close Application");
	}
}
