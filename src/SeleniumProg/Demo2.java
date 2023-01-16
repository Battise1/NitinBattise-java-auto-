package SeleniumProg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\NitinBattise\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String expTitle ="Log in to Facebook";
		
		String actTitle = driver.getTitle();
		if(actTitle.equals(expTitle))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		System.out.println("Actual title =" + actTitle);
		
		String currURL = driver.getCurrentUrl();
		System.out.println("URL =" + currURL);
		driver.quit();
		
		
	}

}
