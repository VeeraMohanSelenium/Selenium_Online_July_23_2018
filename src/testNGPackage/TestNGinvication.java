package testNGPackage;

import org.testng.annotations.Test;

public class TestNGinvication {
	
	//invocationCount : useing executed the testvases in number of times
	
	@Test(invocationCount=10)
	public void test1()
	{
		System.out.println("Hello");
	}

}
