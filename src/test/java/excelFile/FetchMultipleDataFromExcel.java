package excelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		DataFormatter df = new DataFormatter();
		
		String[][] arr = new String[sheet.getLastRowNum()+1][sheet.getRow(2).getLastCellNum()];
		
		//for fetch the values and store the values and print the values in 2D Array
		
		for(int i=0 ; i<=sheet.getLastRowNum();i++)
		{
			for(int j=0 ; j<sheet.getRow(2).getLastCellNum();j++)
			{
				arr[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		  
		
		//  for printing the stored values
		
	/*	for(int i=0 ; i<=sheet.getLastRowNum(); i++)
		{
			for(int j=0 ; j<sheet.getRow(2).getLastCellNum();j++)
			{
				System.out.print(arr[i][j]+"\t");
			}    
			
			// for getting the cursor in next line to print the second row value
		//	System.out.println();
			
		}    */
		wb.close();
		
	}

}
				
	
	
	
		
		
	
		


