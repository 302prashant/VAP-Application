package Generic_Utilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	public String getExcelData(String sheetName, int rowNum, int cellNum) throws Throwable {
		FileInputStream f = new FileInputStream("./TestData.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		String data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return data;
		
		
	}


}
