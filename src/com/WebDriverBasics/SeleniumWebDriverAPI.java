package com.WebDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWebDriverAPI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Selenium WebDriverAPI
		// API:: Application Programing interface

		// Mouse Actions

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Selenium wait time 0.5 Seconds

		// Active :: Threed.sleep(10000)
		// implicitlywait ::
		// Windowdriverwait or Explict

		// WebDriverWait wait = new WebDriverWait(driver, 10);

		// WebElement ele =
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='pass']")));

		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");

		driver.findElement(By.id("btnLogin")).click();

		Actions ac = new Actions(driver);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//b[text()='Leave']"));

		// Mouse over
		ac.moveToElement(ele).build().perform();

		WebElement el = driver.findElement(By.xpath("//a[text()='Apply']"));

		// Right Click()
		ac.contextClick(el).build().perform();

		Thread.sleep(3000);

		// keyboard actions
		ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	}

}
