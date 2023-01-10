package excelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		//Create new row by deleting the older values, should be given only when row doesn't have data
		//Row row = sheet.createRow(3);
		
		//get control over row ,here we are writing in to row 1
		  Row row = sheet.getRow(1);
		
		
		
		//create new cell by deleting the older values
		 //Cell cell = row.createCell(0);
		
		//writing value to cell 2
		Cell cell = row.createCell(2);
		
		
		// it sets the value in to the cell
		cell.setCellValue("Hello");
		
		//save data in to excel
		FileOutputStream fos = new FileOutputStream("./src/test/resources/TestData.xlsx");
		wb.write(fos);
		 
		//to remove older data in file output stream we use flush
		//fos.flush();
		wb.close();
		
		
		

	}

}
