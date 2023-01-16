package SeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\eclipse-workspace\\\\\\\\NitinBattise\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://is.rediff.com/signup/register");
			driver.findElement(By.tagName("input")).sendKeys("Vaibhav");
			driver.findElement(By.tagName("input")).sendKeys("vaibhav@gmail.com");
			//As tagname is duplicate so we cant use for further element
			Thread.sleep(2000);
			driver.findElement(By.id("emailid")).sendKeys("vaibhav@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.name("pass")).sendKeys("Admin@123");

			 driver.findElement(By.className("")).sendKeys("");

			Thread.sleep(2000);

			 driver.findElement(By.linkText("rediff.com")).click();
			driver.findElement(By.partialLinkText("r")).click();

			Thread.sleep(5000);
			driver.close();
	}

}
