package com.Exception_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

public class Testing extends Exception {

	// Exception Handling
	// What is Exception?
	// The unwanted thing is created the distbance from the regular program is
	// called Exception.

	// what is Exception Handling?

	// Throwable

	// 1. Exception
	// 1.1 Checked exception : The compile time JVM will find the error is
	// called Checked Exception
	// we can handle checked exception By useing throws keyword

	public static void test() throws Exception {
		File f = new File("");
		Thread.sleep(2000);

		FileInputStream fis = new FileInputStream(f);
		System.out.println("Hello");

	}

	// 1.2 unchecked Exception: The compile time JVM will not find the error it
	// will haveing only run time is
	// called unChecked Exception
	// by useing try-catch we can handle the Unchecked exceptions and checked
	// exception

	// syntax
	/*
	 * try {
	 * 
	 * }catch(Exception a) {
	 * 
	 * }
	 */
	public static void test1() {
		int a = 10;
		int b = 0;

		try {
			int c = a / b;
			
			System.out.println(c);
			File f = new File("");
			

			//FileInputStream fis = new FileInputStream(f);
			System.out.println("Hello");
		}

		// catch(ArithmeticException e)
		// {
		// System.out.println(e);
		// }
		// catch(InterruptedException e)
		// {
		// System.out.println(e);
		// }
		// catch(IOException e)
		// {
		// System.out.println(e);
		// }
		// catch(Exception e)
		// {
		// System.out.println(e);
		// }
		// catch(Throwable e)
		// {
		// System.out.println(e);
		// }

		finally {
			throw new ArithmeticException("VeeraMohan");
		}
		//System.out.println("Hello");
	}

	// 2. Error

	public static void main(String[] args) throws Exception {
		Testing.test1();
	}

}
