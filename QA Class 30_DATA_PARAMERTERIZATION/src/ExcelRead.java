

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("S:\\JANBASK\\QA - 17th Nov 2023\\QA Class 30_DATA_PARAMERTERIZATION\\src\\TestSuite\\TESTSUITE.xlsx");

		Workbook ws = new XSSFWorkbook(fis);
		
		Sheet s1 = ws.getSheet("GMAIL");
		Row r1 =s1.getRow(2);
		Cell c0= r1.getCell(1);
		//System.out.println(c1.getStringCellValue());
		
		int lastCol=r1.getLastCellNum();
		System.out.println(lastCol);// last column in the row
		
		int lastRow=s1.getLastRowNum();
		System.out.println(lastRow);
		
		
		for(int i=1;i<lastRow;i++) {
			Row r =s1.getRow(i);
			Cell c1= r.getCell(0);
			Cell c2= r.getCell(1);
			Cell c3= r.getCell(2);
			
			System.out.print(c1.getNumericCellValue()+" |");
			System.out.print(c2.getStringCellValue()+" | ");
			System.out.print(c3.getStringCellValue()+"| ");
			System.out.println();
			
		}
		
		
		
	}

}
