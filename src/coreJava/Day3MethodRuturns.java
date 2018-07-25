package coreJava;

public class Day3MethodRuturns {

	public float add(int a, int b) {

		int c = a + b;

		return c;

	}

	public void add(int a, int b, int c) {

		c = a + b;
		int d = c;
		System.out.println(d);
		// return c;

	}

	public String concat(String str, String ster1) {

		String d = str + ster1;

		return d;

	}

	////////////////////////////////////

	// boolean return status

	public boolean stepstus(int a) {
		boolean abc;
		if (a % 2 == 0) {
			abc = true;
		} else {
			abc = false;
		}

		return abc;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//useing f6(Step over ) to check the line by line code execution
		
		//F5(Step Into) is used to enter thr inside method
		Day3MethodRuturns g = new Day3MethodRuturns();

		float s = g.add(10, 30);
		System.out.println(s);
		g.add(23, 43, 89);
		String name = g.concat("Hello", "World");
		System.out.println(name);

		boolean status = g.stepstus(21);
		System.out.println(status);
		if (status) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}

		//Create class Name is a Calculater
		//add(float a,int b)
		//sub
		//mul
		
		
		
		
	}

}
