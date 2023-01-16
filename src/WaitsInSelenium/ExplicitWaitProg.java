package WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitProg {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		//Scenario-1

		// WebElement button1 =driver.findElement(By.xpath("//button[@id='alert']"));
		// button1.click();
		// WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(30));
		// w.until(ExpectedConditions.alertIsPresent());
		// driver.switchTo().alert().accept();

//		//Scenario-2
//		WebElement button2 =driver.findElement(By.xpath("//button[@id='populate-text']"));
//
//		WebElement text = driver.findElement(By.xpath("//h2[@id='h2']"));
//		button2.click();
//		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(30));
//		w.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));

		//Scenario-2
		
		 WebElement button3 = driver.findElement(By.xpath("//button[@id='enable-button']"));
		 button3.click();
		 WebDriverWait z = new WebDriverWait(driver, Duration.ofSeconds(20));
		 z.until(ExpectedConditions.elementToBeClickable(button3));
		driver.close();
	}

}
