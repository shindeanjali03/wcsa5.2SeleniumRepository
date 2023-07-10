package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
      
     public String readExceldata(String excelPath,String sheetname, int rowCount,int cellCount) throws EncryptedDocumentException, IOException	
     {
    	 FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
    	 Workbook wb = WorkbookFactory.create(fis);
    	 Sheet sheet = wb.getSheet(sheetname);
         Row row = sheet.getRow(rowCount);
         Cell cell = row.getCell(cellCount);
         String data = cell.getStringCellValue();
         return data;
  	 
     }
     
     //It is used to get the last count of row where we store the data...
     public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
     {
    	  FileInputStream fis = new FileInputStream(excelPath);
    	  Workbook wb = WorkbookFactory.create(fis);
          Sheet sheet = wb.getSheet(sheetName);
          int rc = sheet.getLastRowNum();
          return rc;
     }
     
   //it is use to write the data into excel sheet
     public void writeExcelData(String excelPath, String sheetName,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
     {
     FileInputStream fis = new FileInputStream(excelPath);
     Workbook wb = WorkbookFactory.create(fis);
     Sheet sheet = wb.getSheet(sheetName);
     Row row = sheet.getRow(rowcount);
     Cell cell = row.createCell(cellcount);
     cell.setCellValue(data);
     
     FileOutputStream fos = new FileOutputStream(excelPath);
     wb.write(fos);
     
     }     
}
