package loans;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameworkClasses.ReadExcel;

public class ReadData {
	ReadExcel rExcel = new ReadExcel();
	
	@Test(dataProvider = "getDataFromExcel")
	
	public void ReadExamResults(String name, String Lname, String size) {
		System.out.println("The get Data Results from Excel");
		System.out.println(name +" "+Lname +" "+ size);
		
		
	}
	
	@DataProvider
	
	public Object [][] getDataFromExcel() throws IOException{
		String excelDirectory = rExcel.getDataConfigProperties("excelDataDir");
		Object[][] arrayObj = rExcel.getExcelData(excelDirectory+"ExcelData.xlsx","Sheet1");
		
		return arrayObj;
	}

}
