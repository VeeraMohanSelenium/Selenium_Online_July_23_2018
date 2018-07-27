package oops;

public class Polymarphism {

	// Polymarphism
	// in Single object we can use different ways is called polymarphism
	// Types of Polymarphism

	// 2 Types
	// 1. Over loading
	// Its only for single class
	// 1.1 Constructor over loading is possible

	public Polymarphism() {
		this(10);
		System.out.println("Hello iam constractor");

	}

	public Polymarphism(int a) {
		this(10, "Hello");
		System.out.println("Hello iam constractor:" + a);
	}

	public Polymarphism(int a, String b) {
		System.out.println("Hello iam constractor:" + (a + b));
	}

	// 1.2 Mthod over loading is possible
	// Same method name but different parameters
	// Same method signature but different parameters

	public void test() {
		System.out.println("I am test method");
	}

	public void test(int a) {
		System.out.println("I am test method  int method");
	}

	public static void test(String a) {
		System.out.println("I am test method  String  method");
	}

	public void m1() {
		System.out.println("i am m1 method");
	}

	public void m2() {
		System.out.println("i am m2 method");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymarphism p = new Polymarphism();
		// Polymarphism p1 = new Polymarphism(10);
		// new Polymarphism(10,"20");

		p.test(10);
		p.test();
		Polymarphism.test("Hello");

	}

}
