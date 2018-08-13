package com.WebDriverBasics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");

		// Window Handling

		// GetWindowHandle() // String
		// get the current focus window id

		// GetWindowHandles() //Set<String>

		// get the all window ides

		// Current main window id
		String mainwindow = driver.getWindowHandle();
		System.out.println("Mainwindow id is:: " + mainwindow);

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		Set<String> list = driver.getWindowHandles();

		// for (String child : list) {
		//
		// System.out.println(child);
		//
		// if (!mainwindow.equals(child)) {
		// driver.switchTo().window(child);
		// }
		// }
		int count = 0;

		for (String string : list) {
			System.out.println(string);
			count++;

			if (count == 2) {
				driver.switchTo().window(string);
				driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
				driver.close();
			}

		}
		// Switch to main window
		driver.switchTo().window(mainwindow);
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");

		driver.findElement(By.id("btnLogin")).click();

	}

}
