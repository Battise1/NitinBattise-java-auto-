package SeleniumProg;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Prog8 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\NitinBattise\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement newuserLabel =driver.findElement(By.xpath("//div[contains(text(),'Your F')]"));
				 
		String expLabel = "Your Full name";
				 
		String actLabel = newuserLabel.getText();
				
				 if(expLabel.equals(actLabel))
				 System.out.println("Label TC pass");
				 else
				 System.out.println("Label TC fail");
				 
				 

				WebElement day =driver.findElement(By.xpath("//select[@id='date_day']"));

				WebElement month =driver.findElement(By.xpath("//select[@id='date_mon']"));

				WebElement year =driver.findElement(By.xpath("//select[@name='Date_Year']"));
				Select s1 = new Select(day);
				s1.selectByIndex(7);
				Thread.sleep(5000);
				s1.selectByIndex(0);
				Thread.sleep(5000);
				s1.selectByValue("09"); //If value attribute is available in html code
				Thread.sleep(5000); //then we can use selectByValue() method
				s1.selectByVisibleText("05"); 
				
				java.util.List<WebElement> allDays = s1.getOptions();
//				for(int i=1;i<32;i++)
//				System.out.println(allDays.get(i).getText());
//				System.out.println("--------");
				for(int i=1;i<allDays.size();i++)
				System.out.println(allDays.get(i).getText());
				System.out.println(allDays.size());

				 Thread.sleep(5000);

				driver.close();
	}

}
