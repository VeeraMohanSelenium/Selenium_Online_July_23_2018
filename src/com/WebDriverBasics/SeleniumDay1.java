package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		// id
		// name
		// class
		String cutTitle = driver.getTitle();
		System.out.println("Current Title is:: " + cutTitle);

		String curUrl = driver.getCurrentUrl();
		System.out.println("Current UTL: " + curUrl);
		// Sendkeys : this method is used to send the any value in only text
		// field

		// Send the user name from the username field
		WebElement txt_Username = driver.findElement(By.id("txtUsername"));
		txt_Username.click();
		txt_Username.clear();
		txt_Username.sendKeys("user01");
		
		// Send the password from the Password field
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");

		// Click on Login Button
		driver.findElement(By.id("btnLogin")).click();

		String vl = driver.getTitle();
		System.out.println("Current Title is:" + vl);

		String val = driver.getCurrentUrl();
		System.out.println("Current UTL: " + val);

		String Window_id = driver.getWindowHandle();
		System.out.println(Window_id);

		boolean status = curUrl.equals(val);
		System.out.println(status);
		if (status) {
			System.out.println("Urls Are Equal");
		} else {
			System.out.println("Urls Are not Equal");
		}

		// driver.close();

	}

}
