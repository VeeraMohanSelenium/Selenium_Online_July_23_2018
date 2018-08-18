package com.WebDriverBasics;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AjaxYahoo {
	
	public static void screenshot(String imgname,WebDriver driver)
	{   //Here TakesScreenshot is a interface 
		//not possible to create the object in interface ,
		//so we do the typecasting between driver object and TakesScreenshot
		TakesScreenshot   img= (TakesScreenshot)driver;
		
		//This statemebt is used to take the screen shot  and store to src
		File src=img.getScreenshotAs(OutputType.FILE);
		
		//This statement is Get the destnation of screenshot with name
		File dest=new File("Screenshot\\"+imgname+".png");
		
		
		try {
			//copy the screenshot source to destination
			FileUtils.copyFile(src, dest);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com/?p=us");

		// Send the data from the Search field
		driver.findElement(By.xpath(".//*[@id='uh-search-box']")).sendKeys("Motrola");
		screenshot("ajax", driver);
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li/span/span"));
		
		for(int i=0;i<list.size();i++)
		{
			String value=list.get(i).getText();
			System.out.println(value);
			if(value.equals("www.motorola.com"))
			{
				Actions ac=new Actions(driver);
				ac.moveToElement(list.get(i)).click().build().perform();
				screenshot("nextpage", driver);
				//list.get(i).click();
				break;
			}
			
		}
		
		
		
		
		
		

	}

}
