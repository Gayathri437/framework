package com.actiTime.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {
	public static String readData(String sheetName,int rowNumber,int cellNumber) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("c://testdata/userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		String s=w1.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		return s;
	}
	public static void writeData(String sheetName,int rowNumber,int cellNumber,String data) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream("c://testdata/userdata.xlsx");
		Workbook w1=WorkbookFactory.create(fis);
		w1.getSheet(sheetName).getRow(rowNumber).createCell(cellNumber).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("c://testdata/userdata.xlsx");
		w1.write(fos);
	}
}

