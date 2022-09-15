package com.saucedemo.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPage {

	public ArrayList<String> getData() throws IOException {

		FileInputStream fis = new FileInputStream(
				"D:\\Training Workspace\\New folder\\Another Folder\\ExamTestCase.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		ArrayList<String> arr = new ArrayList<String>();

		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {

			XSSFSheet sheet = workbook.getSheetAt(i);
			Iterator<Row> rows = sheet.rowIterator();
			Row row = rows.next();
			Iterator<Cell> cell = row.cellIterator();

			int k = 0;
			int column = 0;

			while (cell.hasNext()) {
				if (cell.next().getStringCellValue().equalsIgnoreCase("TestCases")) {
					column = k;
				}
				k++;
			}

			if (workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("HomePage")) {

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase("LoginPage")) {

						Iterator<Cell> ce = r.cellIterator();

						while (ce.hasNext()) {

							arr.add((ce.next().getStringCellValue()));
						}
					}
				}

			}

			else {

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase("InformationPage")) {

						Iterator<Cell> ce = r.cellIterator();

						while (ce.hasNext()) {

							arr.add((ce.next().getStringCellValue()));
						}
					}
				}

			}
		}
		return arr;

	}

}