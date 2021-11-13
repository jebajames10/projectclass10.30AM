package org.hcl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static void main(String[] args) throws IOException {
		File exloc = new File("C:\\Users\\Jebarani\\eclipse-workspace\\Framework\\Driver\\Excel  Data\\info.xlsx");
	   
	Workbook w = new XSSFWorkbook();
	
	Sheet s = w.createSheet("jeba");
	Row r = s.createRow(2);
	Cell c = r.createCell(2);
	c.setCellValue("java");
	FileOutputStream fot = new FileOutputStream(exloc);
	w.write(fot);
	System.out.println("done");
	
	}

}
