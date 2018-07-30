package coreJava;

public class Testing 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		int d=c.add(10, 20);
		System.out.println(d);
		int s=Calculator.mul(d, 43);
		
		System.out.println(s);
		
		int m=Calculator.Sub(d, s);
		System.out.println(m);
		
		

	}

}
