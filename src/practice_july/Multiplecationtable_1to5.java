package practice_july;

import java.util.Scanner;

public class Multiplecationtable_1to5 {

	static int b;

	  public void multiplication()

	{
		// To Accept the input from the keyboard.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input value");

		// nextInt method is used to get the integer values from the scanner
		// class
		int c = sc.nextInt();

		for (int j = 1; j <= c; j++) {
			System.out.println("**********************");

			for (int i = 1; i <= 10; i++) {

				b = j * i;

				System.out.println(j + " * " + i + " = " + b);

			}
		}
		sc=new Scanner(System.in);
		System.out.println("Enter value");
		
		//Get the String values/
		String val=sc.next();
		System.out.println(val);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiplecationtable_1to5 obj = new Multiplecationtable_1to5();

		obj.multiplication();

	}
}
