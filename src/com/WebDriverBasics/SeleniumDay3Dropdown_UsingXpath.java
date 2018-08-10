package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDay3Dropdown_UsingXpath {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//select[@id='month']/option[8]")).click();
		driver.findElement(By.xpath("//select[@id='year']")).click();
		driver.findElement(By.xpath("//select[@id='year']/option[text()='1911']")).click();

	}

}
