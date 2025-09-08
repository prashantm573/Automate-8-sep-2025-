package readwrite;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\EMPDetails1.xlsx");
      
      XSSFWorkbook workbook = new XSSFWorkbook();
      
      
      XSSFSheet sheet = workbook.createSheet("Sheet2");
      
      XSSFRow row0 = sheet.createRow(0);
      row0.createCell(0).setCellValue("EMP ID");
      row0.createCell(1).setCellValue("Emp_Name");
      workbook.write(file);
      
      workbook.close();
      file.close();
      System.out.println("sheet has been created");
	}

}
