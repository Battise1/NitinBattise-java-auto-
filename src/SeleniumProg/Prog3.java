package SeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement newUserLabel = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
	    WebElement redifLogo = driver.findElement(By.xpath("//img[@alt=\"Rediff\"]"));
		String str1 = newUserLabel.getText();
		String str2 = redifLogo.getText();

	
		System.out.println(str1);
		System.out.println(str2);
		driver.close();

	
	
	
	
	
	
	}

}
