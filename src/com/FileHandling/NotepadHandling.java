package com.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class NotepadHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//
		File f=new File("Selenium.txt");
		
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hello");
		bw.newLine();
		bw.write("World");
		bw.newLine();
		bw.write("Testing");
		bw.close();
		
		
		FileReader fr=new FileReader(f);
		@SuppressWarnings("resource")
		BufferedReader br=new BufferedReader(fr);
		
		String line=br.readLine();
		System.out.println(line);
		
		
		
		//System.out.println("Hello");
		
		
		
		
	}

}
