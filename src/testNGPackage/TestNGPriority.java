package testNGPackage;

import org.testng.annotations.Test;

public class TestNGPriority {

	@Test(priority=0)
	public void abc() {
		System.out.println("abc");
		
		char c='a';
		int asci=(int)c;
		System.out.println(asci);
	}

	@Test(priority=-3)
	public void ABC() {
		System.out.println("ABC");
		char c='A';
		int asci=(int)c;
		System.out.println(asci);
	}

	@Test(priority=2)
	public void xyz() {
		System.out.println("xyz");
		char c='x';
		int asci=(int)c;
		System.out.println(asci);
	}

	@Test(priority=4)
	public void XYZ() {
		System.out.println("XYZ");
		char c='X';
		int asci=(int)c;
		System.out.println(asci);
	}

}
