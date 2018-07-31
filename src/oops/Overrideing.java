package oops;

public class Overrideing extends Polymarphism  {

	// 2. Over rideing
	// Parent class same method name same parameters we can diclare  in child class with  our own implementation
	//instance method over rideing is possible :: methods are bounded with class name
	//Static methods over rideing is not possible :: Static methods are bounded with class name
	//Constructor over riding is not possible because  of constructor is depends on Class name
	
	//To call child class constructer to parent class constructer by using "super()"
	//super key word 
	//The jvm will be create the one default constructor u don't have any constructor in child class
	
	
	Overrideing()
	{
		super(10);
	}
	
	
	
	
	public void test() {
		System.out.println("I am test method Over riding");
		
	}

	public void test(int a) {
		System.out.println("I am test method  int method Over riding");
	}

	public static void test(String a) {
		System.out.println("I am test method  String  method Over riding");
	}

	public  void m1() {
		System.out.println("i am m1 method Over riding");
	}

	public void m2() {
		System.out.println("i am m2 method Over riding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Polymarphism p = new Polymarphism();
//		p.m1();
//		p.test();
		
		
		
		
//		Overrideing o=new Overrideing();
//		o.m1();
//		o.test();
		
		
		//Typecasting
		//To create the  object based on parent and child relation is called Typecasting
		
		//Syntex::  ParentClassName pt=new ChildClassName();
		
		Polymarphism pr=new Overrideing();
		
		pr.m1();
		pr.m2();
		pr.test();
		pr.test("String");
		
		
		//
		
		//Overrideing or=new Polymarphism(); yhis relationship is not possible
		
		
		
		

	}

}
