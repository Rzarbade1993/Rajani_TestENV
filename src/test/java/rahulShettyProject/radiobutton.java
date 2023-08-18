package rahulShettyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class radiobutton extends Login {

	@Test(priority = 1)
	public void NavigatetoRadio() throws InterruptedException {
		WebElement ref = driver.findElement(By.xpath("//input[@value=\"radio3\"]"));
		ref.click();
		Thread.sleep(2000);
		System.out.println("radio buttion is clickable");
	}

}
