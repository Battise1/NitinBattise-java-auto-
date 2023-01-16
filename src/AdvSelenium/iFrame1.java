package AdvSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrame1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@id='s'])[1]")).sendKeys("Nitin");
		driver.switchTo().frame("globalSqa");
		
		driver.findElement(By.xpath("//header[@style='margin-top: 0px;']//div//form//input[@name='s']")).sendKeys("Nitin");
//		driver.switchTo().parentFrame();
//		driver.findElement(By.xpath("(//li[@id='menu-item-1513'])[1]")).click();
		Thread.sleep(5000);
//		driver.close();
		
	}

}
