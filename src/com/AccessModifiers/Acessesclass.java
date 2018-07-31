package com.AccessModifiers;

import practice_july.Multiplecationtable_1to5;

public class Acessesclass extends Multiplecationtable_1to5 {
	// AccessModifiers
	// 1. public; We can access any ware in project
	// 2. private : we can declare the method or variables it can be access with
	// in the class
	// 3. protected : we can declare the method or variables by useing protected
	// modifie we can access with in the class and child class  in inheritance
	// 4. default: once declare any variable or method with out any modifers that modifire is called default
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Multiplecationtable_1to5 m = new Multiplecationtable_1to5();
		//m.multiplication();
		
		Acessesclass ac=new Acessesclass();
		ac.multiplication();
	}

}
