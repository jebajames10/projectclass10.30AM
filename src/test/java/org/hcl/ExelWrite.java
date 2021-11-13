package org.hcl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelWrite {
	public static void main(String[] args) throws IOException {
		File exloc = new File("C:\\Users\\Jebarani\\eclipse-workspace\\Framework\\Driver\\Excel  Data\\exel.xlsx");
FileInputStream fip = new FileInputStream(exloc);
Workbook w = new XSSFWorkbook(fip);
Sheet s = w.getSheet("sheet1");
Row r = s.getRow(0);
Cell c = r.getCell(1);
String cell = c.getStringCellValue();
if (cell.equals("mobile")) {
	c.setCellValue("Automation");
}
FileOutputStream fop = new FileOutputStream(exloc);
w.write(fop);
System.out.println("done");

	}

}
