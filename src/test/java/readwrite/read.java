package readwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class read {
	public static void main(String []args) throws IOException {
		  FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\EmpDetails2.xlsx");
		     
		  XSSFWorkbook workbook = new XSSFWorkbook();
		  XSSFSheet sheet = workbook.createSheet("SHeet3");
		  XSSFRow row = sheet.createRow(0);
		  
		  
		  row.createCell(0).setCellValue("Prashant");
		  row.createCell(1).setCellValue("QA Engineer");
		  row.createCell(2).setCellValue("2-Aug-2021");
		  
		  workbook.write(file);
		  System.out.println("File has been written");
		  
		  workbook.close();
		  file.close();
	}
	
		
	}

