package com.String;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String :: To store the any kind kind of data with in Double qutos
		// that is String.

		String name = "Teesting Masters";

		// 1. length(): this method is used to find the length of the String

		// Input;; String Format
		// Out:: Integer
		//
		//
		int len = name.length();
		System.out.println("Size of String is: " + len);

		// CharAt():: This method are used to get the character data from the
		// String in perticular index
		// Index
		// character

		char c = name.charAt(4);
		System.out.println(c);

		// Indexof(): this method is used to get thr perticular charcter first
		// index value
		// Char
		// integer
		int a = name.indexOf('e');
		System.out.println(a);

		// lastIndexof():: this method is used to get the last index of
		// character
		// char
		// integer
		int b = name.lastIndexOf('s');
		System.out.println(b);

		// trim(): This method is used to remove the spaces from last and last
		// of the String
		String city = "  Hyderabad India  ";
		System.out.println(city.length());
		System.out.println(city);

		city = city.trim();
		System.out.println(city.length());
		System.out.println(city);

		// substring();; This methos are used to get the mieddle of starting
		// index and ending index
		// input is beginIndex and end Index
		// output:: String
		System.out.println(name);
		name = name.substring(3, 7);
		System.out.println(name);

		// equals()
		// String
		// bo0lean
		String str="Hello";
		String str1="hello";
		boolean status=str.equals(str1);
		System.out.println(status);
		
		//equalsIgnorecase
		//String
		//boolean
		status=str.equalsIgnoreCase(str1);
		System.out.println(status);
		
		//Contains
		//String
		//boolean
		name="Testing Masters";
		System.out.println(name);
		
		boolean s=name.contains("Masters");
		System.out.println(s);
		
		int s1=name.compareToIgnoreCase("Masters");
		System.out.println(s1);
		
		
		//split :: this method is used to split the String with Respect to special character
		
		//inout:: character
		//Arrays
		
		String na="Hyderabd123;;India;;Usa";
		String[] v=na.split(";;");
		
		System.out.println("length of array is: "+v.length);
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);
		
		
		
		//ToUpperCase(): this methos is convert to any format to upper case of String
		
		String upr="Testing123 Masters";
		
		upr=upr.toUpperCase();
		System.out.println(upr);
		
		
		//ToLowerCase:: To convert to lower case
		
		upr=upr.toLowerCase();
		System.out.println(upr);
		
		String val=str.concat(name);
		System.out.println(val);
		
		boolean st=name.isEmpty();
		System.out.println(st);
		name=name.replaceAll("Testing", "Hyderabad");
		
		System.out.println(name);
		
		

	}

}
