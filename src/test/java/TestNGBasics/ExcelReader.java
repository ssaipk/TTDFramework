package TestNGBasics;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
/*
 * Steps to read excel 
 * * 1. Add 2 dependencies (POI, POI-OOXML)
 * 2. Get the file path
 * 3. Create workbook object
 * 4.Get the sheet from workbook
 * 
 */
	
	public static Object[][] getData() throws IOException {
		String filepath="./src/test/java/TestNGBasics/ExcelRData.xlsx";
		XSSFWorkbook wb= new XSSFWorkbook(filepath);	
		XSSFSheet sheet=wb.getSheet("Sheet1");
		/*
		 * System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		 */
		
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		int colcount=sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[rowcount][colcount];
		for (int row = 0; row <rowcount ; row++) {
			for (int col = 0; col < colcount; col++) {
				data[row][col]=sheet.getRow(row).getCell(col).getStringCellValue();
				
			}
		}
		return data;
	}
}
