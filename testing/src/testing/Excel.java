package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		
		File objFile= new File("C:\\Users\\Debojeet\\Desktop\\Selenium\\test.xlsx");
		FileInputStream objIS= new FileInputStream (objFile);
		
		XSSFWorkbook objWkBk= new XSSFWorkbook(objIS);
		XSSFSheet objSheet= objWkBk.getSheet("celio");
		
		String data1= objSheet.getRow(0).getCell(1).getStringCellValue();
		
		XSSFRow objRow= objSheet.getRow(1);
//		XSSFCell objCell= objRow.getCell(0);
//		
//		System.out.println(objCell.getStringCellValue());
//		objCell= objRow.getCell(1);
//		System.out.println(objCell.getNumericCellValue());
		
		System.out.println("Data from excel is " +data1);
		objIS.close();
		
		FileOutputStream objOS= new FileOutputStream(objFile);
		objRow.createCell(3).setCellValue("Pass");
		objWkBk.write(objOS);
		objOS.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
