package com.WebDriverBasics;

public class Advanced_Xpath {

	//X-path Axcess
	
	//parent:: //input[@name='firstname']/parent::div/parent::div/parent::div/parent::div
	
	//child:: //div[@class='_5k_5']//child::a
	
	//following:: //div[@id='blueBarDOMInspector']/following::a
	
	
	//preceding  :: //select[@id='day']/preceding::span
	
	//following-sibling:: //option[text()='Day']/following-sibling::option[9]/following-sibling::option[9]
	
	//Top to bottom in single parent childs  
	
	//preceding-sibling :://option[text()='Day']/following-sibling::option[9]/following-sibling::option[9]/preceding-sibling::option[8]/preceding-sibling::option[10]
	
	//Bottom to top in single parent childs 
	
	//ancestor::  //input[@name='firstname']/ancestor::div or //input[@name='firstname']/ancestor::body
	//Find the grand father of child
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
