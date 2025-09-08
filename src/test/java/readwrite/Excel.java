package readwrite;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileInputStream  file = new FileInputStream("E:\\Selenium WorkSpace\\automation\\Testdata\\EMPDetails.xlsx");
      //  FileInputStream  file1 = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\EMPDetails.xlsx");
        
      XSSFWorkbook   Workbook   = new  XSSFWorkbook(file);
          XSSFSheet sheet =  Workbook.getSheet("Sheet1");   
                          int totalRows =   sheet.getLastRowNum();
                       int totalCells =   sheet.getRow(0).getLastCellNum();
                          
                       System.out.println(totalRows);
                       System.out.println(totalCells);
                       
                       for (int r = 0;r<=totalRows;r++) {
                    	      XSSFRow  CurrentRow    = sheet.getRow(r);
                    	   
                    	   for(int c=0;c<totalCells;c++) {
                    		XSSFCell   cell = CurrentRow.getCell(c);
                    		System.out.print(cell.toString()+"\t");
                    		   
                    	   }
                    	   System.out.println();
                    	   
                       }
                     Workbook.close();
                     file.close();
   
	}

}
