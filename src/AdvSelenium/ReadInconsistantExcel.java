package AdvSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;

public class ReadInconsistantExcel {

	public static void main(String[] args) throws Exception {

		FileInputStream File = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\Testdata\\Book1.xlsx");
	     Sheet excel = WorkbookFactory.create(File).getSheet("Sheet3");
	    
	    for(int row=0;row<=excel.getLastRowNum();row++) // lastRowNum = 5 (0 1 2 3 4)
	    {
	    	for(int col=0;col<excel.getRow(row).getLastCellNum();col++) //5 4 3 2 1
	    	{
	    	String value = excel.getRow(row).getCell(col).getStringCellValue();
	    	System.out.print(value + "\t");
	    	}
	    	System.out.println();
	    	}
	    	System.out.println("------------");
	    	System.out.println(excel.getLastRowNum());
	    	System.out.println(excel.getRow(0).getLastCellNum());
	
	
	
	}
	

}
