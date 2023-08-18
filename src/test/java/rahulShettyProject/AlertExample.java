package rahulShettyProject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertExample extends SwitchTaB {

	@Test(priority = 7)
	public void alterexample() throws InterruptedException {
		WebElement obj11 = driver.findElement(By.xpath("//input[@id=\"name\"]"));
		obj11.click();
		obj11.sendKeys("Rajani");
		Thread.sleep(2000);

		driver.findElement(By.xpath("////input[@id=\"alertbtn\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println("Alert handle ");

	}
}
