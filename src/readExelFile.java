import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class readExelFile {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		WebElement fullnameTextbox =driver.findElement(By.xpath("//input[@id='fullname']"));

		WebElement emailIdTextbox =driver.findElement(By.xpath("//input[@id='emailid']"));
		WebElement passwordTextbox =driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement retypePassTextbox =driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement radioButton =driver.findElement(By.xpath("//input[@id='sex']"));
		WebElement dropdownDay =driver.findElement(By.xpath("//select[@id='date_day']"));
		WebElement DropdownMonth =driver.findElement(By.xpath("//select[@id='date_mon']"));
		WebElement dropdownyear =driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement LocationTextBox =driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement schoolTextBox =driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement collegeTextBox =driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement captchaTextBox =driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement signUpButton =driver.findElement(By.xpath("//input[@id='repass']"));

		
				FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\Testdata\\Book1.xlsx");
			   org.apache.poi.ss.usermodel.Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
				 String value1 = excel.getRow(0).getCell(0).getStringCellValue();

//				 System.out.println(value1);

				fullnameTextbox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
				emailIdTextbox.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
				passwordTextbox.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
				retypePassTextbox.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
				radioButton.click();
				Select s1 = new Select(dropdownDay);
				s1.selectByVisibleText(excel.getRow(0).getCell(4).getStringCellValue());
				Thread.sleep(2000);
				Select s2 = new Select(DropdownMonth);
				s2.selectByVisibleText(excel.getRow(0).getCell(5).getStringCellValue());
				Select s3 = new Select(dropdownyear);
				s3.selectByVisibleText(excel.getRow(0).getCell(6).getStringCellValue());
				
						
				
				
				Thread.sleep(5000);
				driver.close();
	}

}
