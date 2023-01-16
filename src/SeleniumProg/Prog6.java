package SeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		//div[@id='div_register']//b OR //b[text()='New User? Register here']
		//p[@class='grey1']
		WebElement newuserLabel =driver.findElement(By.xpath("//div[@id='div_register']//b"));

		WebElement tellUsLabel =driver.findElement(By.xpath("//p[@class='grey1']"));
//		 String str1 = newuserLabel.getText();
//		 String str2 = tellUsLabel.getText();
//		System.out.println(str1);
//		 System.out.println(str2);

		System.out.println("Label 1 = " + newuserLabel.getText());
		System.out.println("Label 2 = " + tellUsLabel.getText());
		driver.close();
	}

}
