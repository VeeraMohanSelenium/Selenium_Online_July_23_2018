package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBsignin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Deepthi");
		
		driver.findElement(By.name("lastname")).sendKeys("g");
		
		driver.findElement(By.name("reg_email__")).sendKeys("deepthig2020@gmail.com");
		
		
		WebElement wc = driver.findElement(By.name("reg_email_confirmation__"));
				
		wc.click();
		wc.clear();
		wc.sendKeys("deepthig2020@gmail.com");
	
		driver.findElement(By.id("u_0_o")).sendKeys("Welcome");
		
		WebElement dayField = driver.findElement(By.id("day"));
		
		Select sc = new Select(dayField);
		
		sc.selectByVisibleText("26");
		

		 sc = new Select( driver.findElement(By.id("month")));
		
		sc.selectByVisibleText("Nov");
		
        sc = new Select(driver.findElement(By.id("year")));
		sc.selectByVisibleText("1990");
		
		
		
		//driver.close();
		
		
		
		
	}

}
