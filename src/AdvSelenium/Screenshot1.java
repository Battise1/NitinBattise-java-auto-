package AdvSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1 {


		static WebDriver driver;
		
		public static void captureCompletePageScreenshot() throws Exception
		{
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\Screenshot/Amazon");

		FileHandler.copy(source, dest);
		}
		
		public static void captureLogoScreenshot() throws Exception
		{
		WebElement amazonLogo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		File source = amazonLogo.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\Screenshot/Logo.jpeg");
		FileHandler.copy(source, dest);
		}
		public static void fullScreenShot() throws Exception
		{
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
			File desti = new File("C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\Screenshot/fullScreenshot.jpeg");
			FileHandler.copy(source,desti);
			driver.quit();
			
		}
			
		
		
		public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
		// captureCompletePageScreenshot();
//		captureLogoScreenshot();
		fullScreenShot();
//		driver.close();
		
		
		
		}

}
