package rahulShettyProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SwitchWindow extends Login {

	@Test(priority = 5)
	public void switchwindowexample() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
		
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				
				driver.switchTo().window(child_window);
				driver.manage().window().maximize();

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}

		}
		driver.switchTo().window(parent);
		System.out.println("Windows handel");
		driver.close();
	}
}
