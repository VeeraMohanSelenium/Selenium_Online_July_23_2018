package com.WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumChromeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//select[@id='month']/option[8]")).click();
		driver.findElement(By.xpath("//select[@id='year']")).click();
		driver.findElement(By.xpath("//select[@id='year']/option[text()='1911']")).click();

	}

}
