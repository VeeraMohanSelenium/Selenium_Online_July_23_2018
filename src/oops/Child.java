package oops;

public class Child extends ObjectClass {

	public void m1() {
		System.out.println("i am child m1 method");
	}

	public void m2() {
		System.out.println("i am child m1 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//with out inheritance
		// ObjectClass.test();
		// new ObjectClass().test1();
	
		//System.out.println(new ObjectClass().a);
		
		//with inheritance
		Child c = new Child();
		c.test1();
		test();
		c.m2();
		c.m1();
		System.out.println(c.a);
		

	}

}
