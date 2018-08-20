package testNGPackage;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnations {

	// TestNG Annations:

	// 1. @BeforeSuite
	// 2. @BeforeTest
	// 3. @BeforeClass
	// 4. @BeforeMethod
	// 5. @Test
	// 6. @AfterMethod
	// 4. @BeforeMethod
	// 5. @Test
	// 6. @AfterMethod
	// 7. @AfterClass
	// 8. @AfterTest
	// 9. @AfterSuite

	@BeforeSuite
	public void BS() {

		System.out.println("@BeforeSuite");

	}

	@BeforeTest
	public void BT() {
		System.out.println("@BeforeTest");
	}

	@BeforeClass
	public void BC() {
		System.out.println("@BeforeCLSS");
	}

	@BeforeMethod
	public void BM() {
		System.out.println("@BeforeMethod");
	}

	@Test
	public void test() {
		System.out.println("Test");
	}

	@AfterMethod
	public void AM() {
		System.out.println("@AfterMethod");
	}

	@AfterClass
	public void AC() {
		
		System.out.println("@AfterClass");

	}

	@AfterTest
	public void AT() {
		System.out.println("@AfterTest");
	}

	@AfterSuite
	public void AS() {
		System.out.println("@AfterSuite");
	}

}
