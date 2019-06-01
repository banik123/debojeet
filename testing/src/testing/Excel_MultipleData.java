package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_MultipleData {

	public static void main(String[] args) throws IOException {
	
		File objFile= new File("C:\\\\Users\\\\Debojeet\\\\Desktop\\\\Selenium\\\\test.xlsx");
		FileInputStream objIS= new FileInputStream(objFile);
		
		XSSFWorkbook objWB= new XSSFWorkbook(objIS);
		XSSFSheet objSheet= objWB.getSheet("celio");
		
		int rowCount= objSheet.getLastRowNum();
		System.out.println(rowCount);
		
		for (int i= 0; i<=rowCount; i++)
		{
			String data0= objSheet.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(data0);
			
		}
		
		
		objIS.close();

	}

}
