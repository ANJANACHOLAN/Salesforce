package assignment.salesforce;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SalesforceExcel {

	public static String[][] salesdata() throws IOException {
		XSSFWorkbook book=new XSSFWorkbook("./SalesforceExcel/Salesforce.xlsx");
		XSSFSheet sheet = book.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		short colcount = sheet.getRow(0).getLastCellNum();
		
		String[][] data=new String[rowcount][colcount];
		for(int i=1; i<=rowcount; i++) {
			for(int j=0; j<colcount; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;
								
		}
			

	}

		book.close();
		return data;
}
}