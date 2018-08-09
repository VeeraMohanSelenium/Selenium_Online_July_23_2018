package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDay2Xpath {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");

		driver.findElement(By.xpath("//input[starts-with(@id,'txtUser')]")).sendKeys("user01");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("pass1234");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		
		//Custimizex Xpath::  //div[@id='footer']/div[1]/a

	}

}
