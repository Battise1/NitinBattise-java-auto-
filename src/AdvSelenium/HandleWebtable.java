package AdvSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebtable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://money.rediff.com/index.html");
		List<WebElement> tableRows =

		driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));

		for(int i=0;i<tableRows.size();i++)
		System.out.println(tableRows.get(i).getText()); */

		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");

		driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();
		List<WebElement> tableRows =driver.findElements(By.xpath("//table[@class='dataTable']//tr"));

		for(int i=0;i<tableRows.size();i++)
		System.out.println(tableRows.get(i).getText());
		driver.close();
	}

}
