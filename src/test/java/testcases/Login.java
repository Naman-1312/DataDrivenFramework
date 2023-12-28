package testcases;

import org.testng.annotations.Test;

import ReadExcel.ExcelLibrary;

public class Login {

	@Test
	public void readExcelTest() throws Exception {
		ExcelLibrary obj = new ExcelLibrary();
	String sheetData =  obj.readData("Login",0,1);
	System.out.println("Sheet Data is : " + sheetData );

	}
}
