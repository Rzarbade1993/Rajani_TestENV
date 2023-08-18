package rahulShettyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Totalamount extends ElementDisplayed {

	@Test(priority = 9)
	public void totalamount() throws InterruptedException {
		String expected = "Total Amount collected 296";
		WebElement p = driver.findElement(By.xpath("//div[@class=\"totalAmount\"]"));

		String Actual = p.getText();
		if (expected.equals(Actual))
			System.out.println("Amount = 296");

		else
			System.out.println("page not found");

		Thread.sleep(2000);

		System.out.println("Total Amount collected 296 ");
		driver.quit();
	}
}