package AdvSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.switchTo().frame("iframeResult");
		WebElement timeDisplyButton = driver.findElement(By.xpath("//button[@type='button']"));
		Thread.sleep(5000);
		timeDisplyButton.click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@title='w3schools.com Home']")).click();
		
		driver.quit();
		
	}

}
