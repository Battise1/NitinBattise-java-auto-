package AdvSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcell {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\Testdata\\Book1.xlsx");
		 Sheet excel = WorkbookFactory.create(file).getSheet("Sheet3");
		 
		 for(int row=0;row<4;row++)
		 {
		 for(int col=0;col<5;col++)
		 {
		 String v = excel.getRow(row).getCell(col).getStringCellValue();
		 System.out.print(v + "\t");
		 }
		 System.out.println();
		 }
	}

}
