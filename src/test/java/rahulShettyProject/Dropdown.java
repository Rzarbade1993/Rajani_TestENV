package rahulShettyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends Classexample {

	@Test(priority = 3)
	public void DropdownExample() throws InterruptedException {
		WebElement obj6 = driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
		obj6.click();
		Select dropdown = new Select(obj6);
		dropdown.selectByIndex(3);
		Thread.sleep(2000);
		System.out.println("select dropdown 3");
	}
}
