package rahulShettyProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Checkbox extends Dropdown {
	
	@Test(priority = 4)
	public void DropdownExample() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption3\"]")).click();

		Thread.sleep(2000);
		System.out.println("Select checkbox no- 3 ");

	}
}
