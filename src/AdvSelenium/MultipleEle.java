package AdvSelenium;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleEle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
//		ChromeOptions options = new ChromeOptions();  // headless browse
//		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(/*options*/);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		System.out.println("Current Title1 = " + driver.getTitle());
		
		java.util.List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total Links are = " + links.size());
		for(int i=0;i<links.size();i++) //0 - 65
		{
		System.out.println(links.get(i).getText());
		}
		for(int i=0;i<links.size();i++)
		{
		String expStr = "Gmail";
		String actStr = links.get(i).getText();
		if(expStr.equals(actStr))
		{
		links.get(i).click();
		// i=links.size();
		break;
		}
		}
		System.out.println("Current Title2 = " + driver.getTitle());
		driver.close();
	}

}
