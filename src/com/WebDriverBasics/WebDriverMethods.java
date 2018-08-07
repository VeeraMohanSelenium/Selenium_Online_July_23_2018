package com.WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		//driver.findElement(arg0): 
		//This method is used to find the Single element in the webapplication
			
		//driver.findElements(arg0)
		//:: This method is used to Handle the MultipulElements  in the webapplication
		
		
		// driver.get(arg0);
		// This  method is used to launch the Application
		
		// driver.getCurrentUrl();
		// This Method is used to get the Middle  of any page url
		
		// driver.getTitle();
		// This method is used to get the title of page
		
		// driver.getWindowHandle();
		//This method is used  to get the current focus window id
		
		// driver.getWindowHandles();
		//This method is used  to get the all window ids
		
		// driver.navigate();
		// This method is used to navigate forword,back,refresh,To
		
		
		// driver.switchTo()
		//This used to switch to one windown to another window,One frame to another frame,Handling the alearts
		
		
		// driver.manage()
		// This method is used to manage the window and driver object,Appliay the waits from Webelements
		
		// driver.close();
		// This method is used to close the current focus window
		
		
		// driver.quit();
		//This method are used to Close the all windows at a time
		
		
		

	}

}
