package com.WebDriverBasics;

import java.util.List;

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
		
		String selected_value=sc.getFirstSelectedOption().getText();
		System.out.println(selected_value);
		Thread.sleep(3000);
		sc.selectByValue("9");
		
		selected_value=sc.getFirstSelectedOption().getText();
		System.out.println(selected_value);
		Thread.sleep(3000);
		sc.selectByVisibleText("Day");
		//getFirstSelectedOptions method is used to get the select value iin Dropdowns
	
		selected_value=sc.getFirstSelectedOption().getText();
		
		//getFirstSelectedOption method is used to get the  all select value in Dropdowns
		List<WebElement> list=sc.getAllSelectedOptions();
		System.out.println(selected_value);
		
		//driver.findElement(By.name("birthday_month"));
		sc=new Select(driver.findElement(By.name("birthday_month")));
		
		sc.selectByVisibleText("May");
		selected_value=sc.getFirstSelectedOption().getText();
		System.out.println(selected_value);

	}

}
