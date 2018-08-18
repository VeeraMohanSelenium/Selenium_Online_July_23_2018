package com.WebDriverBasics;

public class SeleniumLocaters {

	public static void main(String[] args) {
		//Locaters
		//Locaters are used to identified by the Exeact Webelement in the WebApplications
		
		//Types of Locaters
		// 1. Id
		//driver.FindElement(By.id(""));
		
		// 2. name
		//driver.FindElement(By.name(""));
		
		// 3. className
		//driver.FindElement(By.className(""));
		
		// 4. TagName
		// driver.FindElement(By.tagName(""));
		
		// 5. linktext
		// driver.FindElement(By.linkText("OrangeHRM, Inc."));
		
		// 6. Partiallinktext
		// driver.findElement(by.partiallinkText("OrangeHRM,"));
		
		// 7. X-path
		// Very fasltly to identified the element
		// Types  of X-path
		// 1. Abslouate X-path
		// We have identified the element starting node to Taeget node of Tag names
		// Is starts with single forword slash "/"
		
		//Ex: html/body/div[1]/div[3]/div[1]/div/div/div/div[1]/div[1]/a
		
	//	*********************************************************************************
		
		// 09/08/2018
		// 2. Partial or Relative x-Path
		
		// We have identified  the element direct Webelement
		// Its starts with '//'
		
		//Syntax:  //TagName[@attributeName='attributevalue']
		
		// Tagname://input[@id='txtUsername']
		
		// 2.1 Custimized X-path
		// Custimizex Xpath::  //div[@id='footer']/div[1]/a
		
		
		
		// //div[@id='social-icons']/a/img
			
		
		// 2.2 Functional x-path
		 //  2.2.1 starts-with()
		// //TagName[starts-with(@attributeName,'value')]
		// //input[starts-with(@id,'txtUser')]
		
		 //  2.2.2 contains()
		
		// //TagName[contains(@id,'Username')]
		//  //input[contains(@id,'Username')]
		
		
		 //  2.2.3 text()
		// //TagName[text()='value']
		
		//  //a[starts-with(text(),'Gm')]
		//    //td[contains(text(),'demo')]
		
		 //  2.2.4 normalized-space()
		// this function are used remove the  space in front and back of any attribute
		
		//Syntax:: //a[normalize-space(@value)='Sign in']
		
		// 2.3 logical x-path
		
		// and, or
		
		//Tagname[@attributeName='value' and @attribute1='value1']
		
		//input[@name='txtUsername1' and @id='txtUsername']
		
		// or ::   //input[@name='txtUsername1' or@id='txtUsername']
		
		
		// 2.4 Advanced X-path
		
		
		
		// 8. Css Selector

		//Syntax::   TageName[attributename='value'] div nth::div[1]
	}

}
