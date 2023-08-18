package rahulShettyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Classexample extends Login {

	@Test(priority = 2)
	public void exampleClass() throws InterruptedException {
		WebElement obj5 = driver.findElement(By.xpath("//input[@id=\"autocomplete\"]"));
		obj5.click();
		obj5.sendKeys("India");
		
//		driver.findElement(By.xpath("//div[@contains(text(),'India')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[contains(text(),'India')])[2]")).click();
//		
//		Select dropdown = new Select(obj5);
//		dropdown.selectByIndex(2);
//		Thread.sleep(2000);
//		System.out.println("INDIA");
	}
}
