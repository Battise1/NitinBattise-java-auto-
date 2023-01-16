package SeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("https://is.rediff.com/signup/register");
	Thread.sleep(3000);
	driver.findElement(By.tagName("input")).sendKeys("Nitin battise");
	Thread.sleep(3000);
	driver.findElement(By.id("emailid")).sendKeys("battisenitin@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.name("pass")).sendKeys("Nitin123@");
	Thread.sleep(3000);
	driver.findElement(By.name("repass")).sendKeys("Nitin123@");
	Thread.sleep(3000);
    driver.findElement(By.name("sex")).click();
    driver.findElement(By.name("date_day")).sendKeys("06");
    Thread.sleep(1000);
    driver.findElement(By.name("date_mon")).sendKeys("Dec");
    Thread.sleep(1000);
    driver.findElement(By.name("Date_Year")).sendKeys("1994");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id ='signup_city']")).sendKeys("Nashik");
    Thread.sleep(3000);
    driver.findElement(By.name("school")).sendKeys("Janata vidyalaya");
    driver.findElement(By.name("college")).sendKeys("SPPU");
    driver.findElement(By.name("fld_captcha")).sendKeys("12345");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@id ='btn_register']")).click();
//    driver.findElement(By.id("btn_register")).click();
    Thread.sleep(5000);
    
	 driver.close();
	
	}
}
