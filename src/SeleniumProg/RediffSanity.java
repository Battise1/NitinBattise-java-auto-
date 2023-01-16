package SeleniumProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffSanity {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		WebElement rediffLink = driver.findElement(By.xpath("//a[@class='ft11']"));
		WebElement rediffLogo = driver.findElement(By.xpath("//img[@class='halflogo']"));
		// WebElement newUserLogo = driver.findElement(By.xpath(""));
		WebElement tellUsLabel = driver.findElement(By.xpath("//p[@class='grey1']"));
		// WebElement yourFullNameLabel = driver.findElement(By.xpath(""));
		// WebElement rediffLink = driver.findElement(By.xpath(""));
		// WebElement rediffLink = driver.findElement(By.xpath(""));
		// WebElement rediffLink = driver.findElement(By.xpath(""));
		// WebElement usernameTextbox = driver.findElement(By.xpath(""));
		// WebElement signupBtn = driver.findElement(By.xpath(""));
		
		int count = 0;
		if((rediffLink.isDisplayed())==true)
		{
		System.out.println("Rediff Link element is available");
		count++;
		}
		else
		System.out.println("Rediff Link element is not available");
		if((rediffLogo.isDisplayed())==true)
		{
		System.out.println("Rediff Logo is available");
		count++;
		}
		else
		System.out.println("Rediff logo is not available");
		System.out.println("Total count of elements are " + count);

		String expTellUsLabel = "Tell us a few things about yourself and we will help you find classmates and\n"
		+ "other friends among rediff.com's millions of world-wide users.";
		String actTellUsLabel = tellUsLabel.getText();
		if(expTellUsLabel.equals(actTellUsLabel))
		System.out.println("Correct");
		else
		System.out.println("incorrect");
	}

}
