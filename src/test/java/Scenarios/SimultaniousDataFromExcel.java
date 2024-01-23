package Scenarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
	
public class SimultaniousDataFromExcel {
	@Test
	public void simultaniousDataFromExcel() throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Excel.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet data1 = book.getSheet("Sheet1");
		Row row = data1.getRow(0);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);
		cell.setCellValue("krishna");
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Excel.xlsx");
		book.write(fos);
		book.close();






	}
}
