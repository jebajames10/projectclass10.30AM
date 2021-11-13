package org.hcl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Launch {
	
public static void main(String[] args) throws IOException  {
	File exloc = new File("C:\\Users\\Jebarani\\eclipse-workspace\\Framework\\Driver\\Excel  Data\\exel.xlsx");
	FileInputStream f = new FileInputStream(exloc);
	Workbook w = new XSSFWorkbook(f); 
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(1);
	Cell c = r.getCell(1);
	System.out.println(c);
	
	int Rows = s.getPhysicalNumberOfRows();
	System.out.println(Rows);
	int cells = r.getPhysicalNumberOfCells();
	System.out.println(cells);
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row row = s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			System.out.print(cell+" ");
			
		}
		System.out.println();
	}
	
}
}

