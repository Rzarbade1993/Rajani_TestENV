package rahulShettyProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Login {
	public static WebDriver driver;

	@BeforeSuite()
	public void BrowserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println("navigate to rahulshettysuite");
		Thread.sleep(2000);
	}

}
