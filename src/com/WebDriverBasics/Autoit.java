package com.WebDriverBasics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.get("http://demo.guru99.com/test/upload/");
	     
	     driver.findElement(By.xpath("//input[@id='uploadfile_0']")).click();
	     
	   Runtime.getRuntime().exec("C:\\Users\\golla\\Desktop\\filepload.exe");
	   
	   
	     
	     
		
		
	}

}
