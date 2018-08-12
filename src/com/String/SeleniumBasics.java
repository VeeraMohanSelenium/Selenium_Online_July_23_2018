package com.String;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasics {
	// What is Selenium: IT is a automation tool. Selenium is open source. It
	// will suppoer java,c#,.Net,Python,Ruby
	
	//

	public static void main(String[] args) {
		//By useing this object to launch the firefox browser
		WebDriver driver=new FirefoxDriver();
		
		//get(): This method are used to launch the application by useing Application URL  
		//input is Url
		// Output is Launching appliaction
		driver.get("http://selenium-release.storage.googleapis.com/index.html?path=2.53/");

	}

}
