package com.WebDriverBasics;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmailaccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver = new FirefoxDriver();
     
     driver.manage().window().maximize();
     
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
     
     driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Testing");
     
     driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Test");
     
     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("QASearch0909");
     

     driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("A123456@");
     
     driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("A123456@");
     
     
     driver.findElement(By.xpath("//span[text()='Next']")).click();
     
     
     
  WebElement Phoneno =  driver.findElement(By.xpath("//input[@id='phoneNumberId']"));
  
  Phoneno.sendKeys("8482479768");
    
    
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    
    Scanner user_input = new Scanner(System.in);
    
    String vercode;
    
    System.out.println ("enter verification code" );
    
    vercode = user_input.next();
    
    driver.findElement(By.xpath("//input[@id='code']")).sendKeys(vercode);
    
    driver.findElement(By.xpath("//span[text()='Verify']")).click();
  
     
     //driver.findElement(By.xpath("//div[@Class='aCsJod oJeWuf']/div[1]/div[1]/input")).sendKeys("2066063707");
     

    // driver.findElement(By.id("phoneNumberId")).sendKeys("2066063707");
    
    Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@aria-label='Recovery email address (optional)']")).sendKeys("deepthig2020@gmail.com");
     


     Thread.sleep(3000);
   driver.findElement(By.xpath("//select[@class='N9rVke']/options[4]")).click();
   
   driver.findElement(By.xpath("//input[@aria-label='Day']")).sendKeys("14");
   
   driver.findElement(By.xpath("//input[@aria-label='Year']")).sendKeys("1984");
   
   driver.findElement(By.xpath("//select[@aria-labelledby='gender-label']/options[2]")).click();
   
   driver.findElement(By.xpath("//span[text()='Next']")).click();
		
   driver.findElement(By.xpath("//span[text()='Send']")).click();
		
  // driver.close();
	}

}
