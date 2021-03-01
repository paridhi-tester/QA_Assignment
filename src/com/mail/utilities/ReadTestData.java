package com.mail.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadTestData {
        
	@SuppressWarnings("resource")
	public ArrayList<String> getDataFromExcelSheet(String fileName, String sheetName) {

		ArrayList<String> details = new ArrayList<String>();
		String filePath = "D:\\Selenium Projects\\compose_mail\\TestData";
	//	String fileName = "InputData.xlsx";
	
		File file = new File(filePath + "\\" + fileName);
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			
			  for (int i = 0; i <= sheet.getLastRowNum(); i++) { 
				  
			  String data = sheet.getRow(i).getCell(0).getStringCellValue(); 
			  
			  details.add(data);
			 
					 
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return details;
	}
}