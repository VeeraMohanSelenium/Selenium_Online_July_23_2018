package coreJava;

public class Day2Arrays
{

	public static void main(String[] args) {
		// non- primitive data types

		// int[]
		// it allows only integer values 0-9
		int[] a = { 98, 45, 65, 76, 89, 9, 34 };
		// 0,1 ,2 ,3,4,5,6
		// looping conditions
		// for
		// foreach
		// while
		// do-while
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			System.out.println(x);
		}
		// x = a[6];
		// System.out.println(x);
		int len = a.length;
		System.out.println(len);
		System.out.println(a[6]);

		// String[]

		String[] str = { "Hello", "Test", "value", "1235" };

		System.out.println(str[1]);

		// char[]
		char[] ch = { 'a', '3', 'r' };

		// Object[]

		Object[] obj = { "Testing", 123, '4', 'A', true };

		// length Find the length of array
		int asdd = obj.length;
		System.out.println(asdd);

		// Single dimensional array

		int[] f = new int[5];

		// adding values in arrays
		f[0] = 1;
		f[3] = 4;
		f[1] = 6;
		f[2] = 7;
		f[4] = 10;
		// {1,6,7,4,10}
		System.out.println(f[3]);

		// Single
		String[] s = new String[5];

		// adding values in arrays
		s[0] = "1";
		s[3] = "4";
		s[1] = "6";
		s[2] = "Gehj";
		s[4] = "10";
		// {1,6,7,4,10}
		System.out.println(s[2]);
		System.out.println("*****************************");
		for(String r:s)
		{
			System.out.println(r);
		}
		// Multi dimentianal
		System.out.println("***************************");
		Object[][] ob = new Object[2][3];
		ob[0][0] = 23.23;
		ob[0][1] = 'A';
		ob[0][2] = "Hello";
		ob[1][0] = 'B';
		ob[1][1] = 'd';
		ob[1][2] = 0.66;

		System.out.println(ob[1][0]);
		System.out.println(ob[1][2]);
		// row count
		int rcount = ob.length;
		System.out.println("row count is::" + rcount);

		// ccount
		int ccount = ob[1].length;
		System.out.println(ccount);
		
		
		//while
		/*while(condition)
		{
			
			
			increment or decrement
		}*/
		String[] u = { "Hello", "Test", "value", "1235" };
		System.out.println("++++++++++++++++++++++++++");
		int j=0;
		int size=u.length;
		while(j<size)
		{
			System.out.println(u[j]);
			
			j++;
		}
		
		System.out.println("+++++++++++++++++++++++++++++++");
		
		
		
		
		/*
		 * do-while
		 * 
		 * do
		 * {
		 *logics
		 * 
		 * increment or decrement
		 * }while(condition);
		 *  
		 
		 */
		
		String[] q = { "Hello", "Test", "value", "1235" };
		
		int y=0;
		int le=q.length;
		do
		{
			
			System.out.println(q[y]);
			y++;
		}while(y<le);
		
		

	}
	
	//Print the 2 table
	//print the tables from 1-5
	//if,ifelse,ifelseif,switch
	
	//only even numbers from 1-100
	//print the prime numbers from 1-100
	
	
	
	
/*  * 
	* *
	* * *
	* * * *
	* * * * *
	
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
	*/
	

}
