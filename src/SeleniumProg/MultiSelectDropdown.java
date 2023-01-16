package SeleniumProg;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\eclipse-workspace\\\\\\\\NitinBattise\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement carDropdown = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s = new Select(carDropdown);
		System.out.println(s.isMultiple());
		s.selectByVisibleText("Volvo");
		// Thread.sleep(2000);
		s.selectByVisibleText("Audi");
		// Thread.sleep(2000);
		s.selectByVisibleText("Saab");
		// Thread.sleep(2000);
		System.out.println("All selected options");
	    java.util.List<WebElement> selectedOptions = s.getAllSelectedOptions();
		for(WebElement value : selectedOptions)
		System.out.println(value.getText());
		WebElement fstOption = s.getFirstSelectedOption();
		System.out.println("First Option = " + fstOption.getText());
		// s.deselectByVisibleText("Audi");
		// Thread.sleep(2000);
		// s.deselectByVisibleText("Volvo");
		// Thread.sleep(2000);
		
		driver.close();
	}

}
