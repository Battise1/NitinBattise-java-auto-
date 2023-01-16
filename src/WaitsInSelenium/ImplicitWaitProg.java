package WaitsInSelenium;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitProg {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("seleni");

		// Thread.sleep(3000);

		 java.util.List<WebElement> autoSugEle = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for(int i=0;i<autoSugEle.size();i++)
			System.out.println(autoSugEle.get(i).getText());
			for(int i=0;i<autoSugEle.size();i++)
			{
			if(autoSugEle.get(i).getText().equals("selenium webdriver"))
			{ //selenium.equals("selenium webdriver")
			//other than string comparison ==

			// String str = "ABC";
			// String str1 = new String("XYZ");
			//String compare .equals()
			autoSugEle.get(i).click();
			break;
			}
			}
			Thread.sleep(5000);
			driver.close();
	
	}

}
