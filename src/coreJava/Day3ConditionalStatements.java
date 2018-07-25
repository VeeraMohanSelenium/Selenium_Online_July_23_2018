package coreJava;

public class Day3ConditionalStatements {

	public static void main(String[] args) {

		// if

		/*
		 * if(contidion) { /// }
		 */

		int a = 13;

		if (a % 2 == 0) {
			System.out.println("a is even number");
		}
		System.out.println("Hello");

		// ifelse
		/*
		 * if(condition){ logics }else{
		 * 
		 * iogics
		 * 
		 * }
		 */
		System.out.println();
		if (a % 2 == 0) {
			System.out.println(a + ":  is a even number");
		} else {

			System.out.println(a + ":  is a odd number");
		}

		System.out.println();
		int evencount = 0;
		int oddcount = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + ":  is a even number");
				evencount++;
			} else {
				System.out.println(i + ":  is a odd number");
				oddcount++;
			}

		}
		System.out.println(evencount);
		System.out.println(oddcount);

		// ifelseif
		int c = 10;
		int b = 10;

		if (c >= b) {
			System.out.println("c is greater then b");
		} else if (c != b)

		{
			System.out.println("c is not equal  b");

		} else if (c < b) {
			System.out.println("c is less then b");
		} else {
			System.out.println("Default");
		}

		// switch

		/*
		 * switch (key) { case value:
		 * 
		 * break; case value:
		 * 
		 * break; case value:
		 * 
		 * break; case value:
		 * 
		 * break;
		 * 
		 * default: break; }
		 */

		String browser = "chrome";
		switch (browser) {

		case "chrome":
			
			System.out.println("Launch the chrome browser");
			break;
			
		case "ie":
			
			System.out.println("Launch the ie browser");
			
			break;

		case "opera":
			
			System.out.println("Launch the opera browser");
			
			break;
		case "Safari":
			
			System.out.println("Launch the safari browser");
			break;
			
		case "ff":
			System.out.println("Launch the firefox browser");
			break;
		default:
			
			System.out.println("Please enter the valid browser");
			
			break;

		}

		// nestedif
		
		/*if(condition)
		{
			
			if(condition1)
			{
				if( condition2)
				{
					
				}
			}
			
			
		}*/

	}

}
