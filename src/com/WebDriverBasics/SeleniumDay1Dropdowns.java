package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDay1Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement dayField=driver.findElement(By.id("day"));
		
		//Select class are used to handle the drop downs
		Select sc=new Select(dayField);
		Thread.sleep(3000);
		sc.selectByIndex(15);
		Thread.sleep(3000);
		sc.selectByValue("9");
		Thread.sleep(3000);
		sc.selectByVisibleText("Day");
		
		//driver.findElement(By.name("birthday_month"));
		sc=new Select(driver.findElement(By.name("birthday_month")));
		
		sc.selectByVisibleText("May");

	}

}
