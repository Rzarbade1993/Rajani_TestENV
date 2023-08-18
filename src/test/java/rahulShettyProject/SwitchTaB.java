package rahulShettyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SwitchTaB extends SwitchWindow {

	@Test(priority = 6)
	public void switchtabexample() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id=\"opentab\"]")).click();

		Thread.sleep(2000);

		WebElement e = driver.findElement(By.xpath("//a[@class=\"active\"]"));
		String expected = "Home";
		String Actual = e.getText();
		if (expected.equals(Actual))
			System.out.println("dashboard is displayed");

		else
			System.out.println("dashboard is not displayed");

		Thread.sleep(2000);
		driver.close();

		System.out.println("new tab open");

	}
}
