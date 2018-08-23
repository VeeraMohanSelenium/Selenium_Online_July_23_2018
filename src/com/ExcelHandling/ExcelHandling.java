package com.ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	public static void main(String[] args) throws Exception {
		// Excel Handling
		// Is used to store the TestData

		// Data Driven Framework
		// Apchi Jar files

		// File

		// FileINputStreem and FileOutputStreem

		// FileINputStreem :: to get the data from Excel

		// FileOutputStreem//Write the data to Excel

		// XSSFWorkbook or HSSFWorkbook

		// Below 2003 microsoft version HSSFWorkbook its extence with .XLS

		// After 2003 microsoft version XSSFWorkbook its extence with .XLSX

		// SheetHandling

		// XSSFSheet

		// HSSFSheet
		File f = new File("Selenium.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook book = new XSSFWorkbook(fis);

		XSSFSheet sheet = book.getSheet("Test$");

		// getStringCellValueL : this method are used to get String data
//		String value = sheet.getRow(1).getCell(2).getStringCellValue();
//		System.out.println(value);
//
//		// getNumericCellValue : this method are used to get numaric data
//		double d = sheet.getRow(2).getCell(2).getNumericCellValue();
//		System.out.println(d);

		// find the row count

		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);

		// Find the last cell number based on row
		int colcount = sheet.getRow(1).getLastCellNum();

		System.out.println(colcount);
		int colcount1 = sheet.getRow(3).getLastCellNum();

		System.out.println(colcount1);
		
		
		for(int i=1;i<=rowcount;i++)
		{
			int ccount=sheet.getRow(i).getLastCellNum();
			
			for(int j=0;j<ccount;j++)
			{
				XSSFCell data=sheet.getRow(i).getCell(j);
				//data.setCellType(data.CELL_TYPE_STRING);
				
				System.out.println(data.getStringCellValue());
			}
		}
		
		
		sheet.getRow(3).createCell(1).setCellValue("Hyd");
		sheet.getRow(3).createCell(2).setCellValue("USA");
		sheet.createRow(4).createCell(1).setCellValue("122");
		
		sheet.getRow(4).createCell(2).setCellValue("54321");
		
		FileOutputStream out=new FileOutputStream(f);
		book.write(out);
		book.close();
		out.flush();
		out.close();

	}

}
