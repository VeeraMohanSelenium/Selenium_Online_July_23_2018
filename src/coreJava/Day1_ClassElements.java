package coreJava;

public class Day1_ClassElements {
	// ClasElements
	// variables
	// Local:: Only inside methods is call Local Variables

	// Instance :: In side class out side methods is call Instance methods

	// Static :: In side class out side methods with static keyword;

	static int abc = 20;

	static String cba = "World";

	// DataTypes
	// To Store the what kind of data to store the particular Ref. Variable
	// Primitive : it will store the single value

	// int
	// short-- Only Numeric values
	// long
	int a = 10;
	short s = 23;
	int y = 34;

	// double -- decimals 0.0

	double d = 23.09;

	// float

	float f = 34.76f;

	// bolean : true or false
	boolean status = true;

	boolean u = false;

	// char : only single character

	char c = 'A';
	char g = '1';

	// String: Only string format: "Testing"

	String str = "Hello";
	String str1 = "25455";

	// non Primitive : To store multipul Values
	int i = 10;

	// Methods: Its a block of a code .when u want required that code we can
	// reuse
	// instance methods;;
	public int m1() {
		// m2();
		System.out.println("Hello i am method m1:: " + (a + y));
		int z = a + y;
		return z;
	}

	// static methods

	public static void m2() {
		Day1_ClassElements obj = new Day1_ClassElements();
		int e = obj.m1();
		System.out.println(e);
		System.out.println("I am method m2::  " + (obj.a + obj.y));
	}

	public static void m2(int a) {
		Day1_ClassElements obj = new Day1_ClassElements();
		int e = obj.m1();
		System.out.println(e);
		System.out.println("I am method m2::  " + (obj.a + obj.y));
	}

	// Constructor
	// we have to write any logics in side constructor those logics are executed
	// when during the object creation time
	// Constructor name and class name must be same.
	// constructor will not return any value
	// to call one constructor to another constructor by using this();
	// constructor calling statement must be in 1st statement

	public Day1_ClassElements() {
		// TODO Auto-generated constructor stub
		this(1);
		System.out.println("Hello iam Constructor");
	}

	public Day1_ClassElements(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("Hello iam Constructor" + a);
	}

	// Instance blocks

	{

		System.out.println("I am Instance block");

	}

	// Static blocks
	static {
		System.out.println("Static blocks");
	}

	//////////////////////////////////////////////////////////
	public void test() {
		System.out.println(str);
		System.out.println(abc);
	}

	public static void main(String[] args) {

		// Local Variables
		int c = 36;
		String g = "Hello";

		System.out.println(Day1_ClassElements.abc);
		System.out.println(cba);

		// Object
		// NAmed Object:: ClassName= refobj=new ClassNAme();

		Day1_ClassElements obj = new Day1_ClassElements();
		// obj.m1();
		Day1_ClassElements.m2();

		// name less Object
		// new ClassName();
		new Day1_ClassElements();

		System.out.println(obj.str);
		System.out.println(abc);
		System.out.println(new Day1_ClassElements().str);

	}

}
