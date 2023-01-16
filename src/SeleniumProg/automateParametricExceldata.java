package SeleniumProg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class automateParametricExceldata {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 WebElement yourFullNameTextBox = driver.findElement(By.xpath("//input[@id='fullname']"));
		 WebElement yourMailIdTextBox = driver.findElement(By.xpath("//input[@id='emailid']"));
		 WebElement passwardTextBox = driver.findElement(By.xpath("//input[@id='pass']"));
		 WebElement rePassWardTextBox = driver.findElement(By.xpath("//input[@id='repass']"));
		 WebElement radioButton = driver.findElement(By.xpath("//input[@id='sex']"));
		 WebElement dayDropDown = driver.findElement(By.xpath("//select[@id='date_day']"));
		 WebElement monthDropDown = driver.findElement(By.xpath("//select[@id='date_mon']"));
		 WebElement yearDropdown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		 WebElement locationTextBox = driver.findElement(By.xpath("//input[@id='signup_city']"));
		 WebElement schoolTextBox = driver.findElement(By.xpath("//input[@id='school']"));
		 WebElement collegeTextBox = driver.findElement(By.xpath("//input[@id='college']"));
		 WebElement captchaTextBox = driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		 WebElement signupButton = driver.findElement(By.xpath("//input[@id='btn_register']"));
 
		 FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\Testdata\\Book1.xlsx");
		 Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
//		 String value1 = excel.getRow(0).getCell(0).getStringCellValue();
		 
		 yourFullNameTextBox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
		 yourMailIdTextBox.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
		 passwardTextBox.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
		 rePassWardTextBox.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
		 radioButton.click();
//		 Select s1 = new Select(dayDropDown);
//		 s1.selectByVisibleText(excel.getRow(0).getCell(4).getStringCellValue());
//		 Thread.sleep(2000);
//		 Select s2 = new Select(monthDropDown);
//		 s2.selectByValue(excel.getRow(0).getCell(5).getStringCellValue());
//		 Thread.sleep(2000);
//		 Select s3 = new Select(yearDropdown);
//		 s3.selectByVisibleText(excel.getRow(0).getCell(6).getStringCellValue());
		 dayDropDown.sendKeys(excel.getRow(0).getCell(4).getStringCellValue());
		 Thread.sleep(2000);
		 monthDropDown.sendKeys(excel.getRow(0).getCell(5).getStringCellValue());
		 Thread.sleep(2000);
		 yearDropdown.sendKeys(excel.getRow(0).getCell(6).getStringCellValue());
		 
		 locationTextBox.sendKeys(excel.getRow(0).getCell(7).getStringCellValue());
		 Thread.sleep(2000);
		 schoolTextBox.sendKeys(excel.getRow(0).getCell(8).getStringCellValue());
		 Thread.sleep(2000);
		 collegeTextBox.sendKeys(excel.getRow(0).getCell(9).getStringCellValue());
		 captchaTextBox.sendKeys(excel.getRow(0).getCell(10).getStringCellValue());
		 Thread.sleep(2000);
		 signupButton.click();
		 Thread.sleep(5000);
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File desti = new File("C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\Screenshot/pic.jpeg");
		 FileHandler.copy(source,desti);
		 
		driver.close(); 
	}


}
