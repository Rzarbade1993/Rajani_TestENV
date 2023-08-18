package rahulShettyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ElementDisplayed extends AlertExample {

	@Test(priority = 8)
	public void elementdisplayed() throws InterruptedException {
		WebElement obj12 = driver.findElement(By.xpath("//input[@id=\"show-textbox\"]"));
		obj12.click();

		WebElement obj2 = driver.findElement(By.xpath("//input[@id=\"displayed-text\"]"));
		obj2.click();
		obj2.sendKeys("AutomationTesting");

		Thread.sleep(2000);
		System.out.println("Element displayed Example");

	}

}
