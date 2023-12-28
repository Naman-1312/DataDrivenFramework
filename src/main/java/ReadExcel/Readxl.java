package ReadExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class Readxl {
@Test
	public void readExcel () throws Exception {
		String excelPath = "D:\\Eclipse\\KG_DataDriven\\TestData\\TestData.xlsx";
	String fileName = "TestData";
	String sheetName = "Login";
	
	File file = new File (excelPath);
	FileInputStream fis = new FileInputStream(file);
	
	XSSFWorkbook wb = new XSSFWorkbook (fis);
	
	XSSFSheet sheet = wb.getSheet(sheetName);
	
	int rowCount = sheet.getLastRowNum();
	System.out.println("Total Row no. is : " + rowCount);
//	String data = sheet.getRow(0).getCell(0).getStringCellValue();
//	String data2 = sheet.getRow(0).getCell(1).getStringCellValue();
//	System.out.println("Sheet Data is : " + data);
//	System.out.println("Sheet Data is : " + data2);
    for (int i=0; i<=rowCount ; i++) {
	Row row = sheet.getRow(i);
	for (int j=0; j<row.getLastCellNum();j++) {
	String data = sheet.getRow(i).getCell(j).getStringCellValue();
	System.out.println("Sheet Data is : " + data);
	}
}

}
}
