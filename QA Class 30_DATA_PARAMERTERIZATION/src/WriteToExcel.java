import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class WriteToExcel {
	
	//https://poi.apache.org/components/spreadsheet/quick-guide.html#NewWorkbook

	public static void main(String[] args) throws IOException {
		Workbook wb = new HSSFWorkbook();
		
		Sheet s1 = wb.createSheet("SHEET A");
		Sheet s2 = wb.createSheet("SHEET B");
		
		Row r1 =s1.createRow(0);
		Row r2 =s2.createRow(12);//12th row
		
		Cell c1 = r1.createCell(0);
		Cell c2 = r1.createCell(1);
		Cell c3 = r1.createCell(2);
		
		c1.setCellValue(1.2);
		c2.setCellValue("Welcome");
		c3.setCellValue(56996);
		
		
		r2.createCell(10).setCellValue("10th row");
		
		try  (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA - 17th Nov 2023\\QA Class 30_DATA_PARAMERTERIZATION\\src\\TestSuite\\Test.xls")) {
		    wb.write(fileOut);
		    
		    
		}
	}

}
