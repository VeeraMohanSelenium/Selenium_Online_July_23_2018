package testNGPackage;

import org.testng.annotations.Test;

public class TestNGGrouping {
	
	@Test(groups="smoke")
	public void test1()
	{
		System.out.println("Hello i am smoke");
	}
	@Test(groups="Sanity")
	public void test2()
	{
		System.out.println("Hello");
	}
	@Test(groups="smoke")
	public void test3()
	{
		System.out.println("Hello i am smoke test");
	}

}
