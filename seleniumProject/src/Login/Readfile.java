package Login;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfile {
	
	public static void main(String[] args) {
		 XSSFWorkbook wb;
		 XSSFSheet sh1;
		try {
			  // Specify the path of file
			  File src=new File("C:\\Users\\puja.domke\\Documents\\puja\\readfile.xlsx");
			 
			   // load file
			   FileInputStream fis=new FileInputStream(src);
			 
			   // Load workbook
			    wb=new XSSFWorkbook(fis);
			   
			   // Load sheet- Here we are loading first sheetonly
			     sh1= wb.getSheetAt(0);
			 
			  // getRow() specify which row we want to read.
			 
			  // and getCell() specify which column to read.
			  // getStringCellValue() specify that we are reading String data.
			 
			 
			 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			 
			 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			 
			 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			 
			  } catch (Exception e) {
			 
			   System.out.println(e.getMessage());
			 
			  }
	}
			 
			 
}
 
	


