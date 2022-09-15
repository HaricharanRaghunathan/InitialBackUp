package com.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Training Workspace\\New folder\\TestCases.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		
		for(int i=0;i<sheets;i++) {
			if(workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.rowIterator();
				Row row = rows.next();
				Iterator<Cell> cell = row.cellIterator();
				
				int k = 0;
				int column = 0;
				
				while (cell.hasNext()) {
					if(cell.next().getStringCellValue().equalsIgnoreCase("TestCases")){
						column=k;
					}
					k++;
				}
			
				while (rows.hasNext()) {
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("LoginPage")){
				
						Iterator<Cell>ce = r.cellIterator();
						
						while(ce.hasNext()) {
						System.out.println(ce.next().getStringCellValue());	
						}
						}
					}
					
					
				
				
			}
			
			
		}
			
	}

}
