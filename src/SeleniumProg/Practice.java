package SeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Practice {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
	    String expTString = "Log in to Facebook";
	    String actTString = driver.getTitle();
	    if(actTString.equals(expTString))
	    {
	    	System.out.println("test case pass");	
	    }
	    else
	    {
	    	System.out.println("test case fail");
	    }
//		driver.findElement(By.tagName("input")).sendKeys("battisenitin@gmail.com");
//		Thread.sleep(5000);
//		driver.findElement(By.tagName("input")).sendKeys("Nitin1@");
		Thread.sleep(5000);
//		driver.findElement(By.id("loginbutton")).sendKeys(args);
		driver.close();
		
		
	}
}
