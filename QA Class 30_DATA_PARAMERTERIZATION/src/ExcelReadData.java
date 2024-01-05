
public class ExcelReadData {

	public static void main(String[] args) {
		Xls_Reader xls= new Xls_Reader("S:\\JANBASK\\QA - 17th Nov 2023\\QA Class 30_DATA_PARAMERTERIZATION\\src\\TestSuite\\TESTSUITE.xlsx");
		
		int rowCount=xls.getRowCount("GMAIL");
		
		System.out.println(rowCount);
		
		String value=xls.getCellData("GMAIL", "STATUS", 5);
		
		//System.out.println(value);
		
		for(int i=1;i<=rowCount;i++) {
			
			String c1=xls.getCellData("GMAIL", "TCID", i);
			String c2=xls.getCellData("GMAIL", "TESTCASE", i);
			String c3=xls.getCellData("GMAIL", "STATUS", i);
			System.out.println(c1+" | "+c2+"| "+c3);
		}
		xls.addSheet("TEST_INFO");
		xls.addColumn("TEST_INFO", "order_id");

	}

}
