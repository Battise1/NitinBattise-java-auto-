package SeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws Exception {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(5000);
	String expTitle ="Log in to Facebook";
	String actTitle =driver.getTitle();
	if(actTitle.equals(expTitle))
	{
		System.out.println("Test case pass");
	}
	else
	{
		System.out.println("test case fail");
	}
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nitinbattise@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Nitin123@");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	Thread.sleep(10000);
	driver.close();



	
	
	
	
	}
	

}
