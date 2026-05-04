package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	
		public String getStringDataFromExcel(String sheetName,int rowIndex, int colIndex) throws FileNotFoundException {
			FileInputStream fis = new FileInputStream("./src/test/resource/TestData/Testscript.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
			
			
		}
		 public double getNumberDataFromExcel(String sheetName,int rowIndex, int colIndex) throws FileNotFoundException {
	     FileInputStream fis = new FileInputStream("./src/ test/resources/TestData/Testscript.xlsx");
	     Workbook wb = WorkbookFactory.create(fis);
	     return wb.getSheetIndex(sheetName).getRow(rowIndex).getCell(colIndex).getNumberisCellValue();	 
		 }

		 public boolean getBooleanDataFromExcel(String sheetName, int rowIndex, int colIndex) {
			return false;
		 }
}
		