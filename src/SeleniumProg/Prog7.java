package SeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog7 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\NitinBattise\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		WebElement button =driver.findElement(By.xpath("//button[@id='disable']"));
		System.out.println(button.isDisplayed()); //true
		System.out.println(button.isEnabled()); //false
		System.out.println("------------");
		
		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
		
		Thread.sleep(10000);
		System.out.println(button.isDisplayed()); //true
		System.out.println(button.isEnabled()); //true
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		System.out.println("Before click :- " + checkBox.isSelected());
		Thread.sleep(1000);
		checkBox.click();
		System.out.println("After click :- " + checkBox.isSelected());
		driver.close();
	}

}
