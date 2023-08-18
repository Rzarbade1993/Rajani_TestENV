package rahulShettyProject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class links2 extends Login {

	@Test(priority = 1)
	public void TotalLinks() throws InterruptedException {
		
		try {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

//		String title = driver.getTitle();
//		String[] titles = { "testing", "test" };

		for (int i = 0; i < links.size(); i++) {
			
			if (i >= 1 && i < 3) { // not clicking i=0 as first link was blank

				System.out.println("The link is" + i);
				links.get(i).click();
				
				Thread.sleep(3000);
				links = driver.findElements(By.tagName("a"));
			}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void clickfirstlink() {

		String ExpectedTitle = "DOCUMENTS REQUEST";
		WebElement e = driver.findElement(By.xpath("//div[@class=\"inner-box\"]//following::h1[1]"));
		String ActualTitle = e.getText();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Titlematch");
	}

	@Test(priority = 3)
	public void clickSeconflink() {
		
		String ExpectedTitle = "DOCUMENTS REQUEST";
		WebElement g = driver.findElement(By.xpath("//div[@class=\"header-text hidden-xs\"]"));
		String ActualTitle = g.getText();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Homepage is open");
	}
//
////	public void exception() {
//
//	try {
//		clickSeconflink();
//	} catch (ElementNotfound f) {
//		f.printStackTrace();
//
//}

//driver.close();
}
