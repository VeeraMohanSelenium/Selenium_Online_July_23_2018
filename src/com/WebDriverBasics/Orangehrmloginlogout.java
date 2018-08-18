package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Orangehrmloginlogout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user01");
		
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");
				
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
        driver.findElement(By.xpath("//a[text()='Welcome TestingMasters']")).click();
        
        
        Actions ac = new Actions(driver);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Logout']"));
		ac.moveToElement(ele).build().perform();
		driver.close();
		
	}

}
