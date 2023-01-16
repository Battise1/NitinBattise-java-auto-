package SeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws Exception {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.freecharge.in/");
	driver.findElement(By.xpath("//span[@class='login-btn']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8698754212");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();

	Thread.sleep(5000);
	driver.close();
	}

}
