package rahulShettyProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Links extends Login {

	@Test()
	public void TotalLinks() throws InterruptedException {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			System.out.println("Inside For loop " + links.get(i).getText());

			if (i >= 1 && i < 3) { // not clicking i=0 as first link was blank

				System.out.println("Inside For loop " + links.get(i).getText());
				links.get(i).click();
				Thread.sleep(3000);

				driver.navigate().back();

				Thread.sleep(3000);
				links = driver.findElements(By.tagName("a")); // because getting stale element exception as DOM got
																// changed
//
//				driver.findElement(By.xpath("//div[@class=\"pull-left logo-outer\"]//following::img[1]]"));
//				String ExpectedTitle = "RahulShetty";
//				WebElement e = (driver
//						.findElement(By.xpath("//div[@class=\"pull-left logo-outer\"]//following::img[1]]")));
//				String ActualTitle = e.getText();
//				Assert.assertEquals(ActualTitle, ExpectedTitle);
//				System.out.println("Titlematch");
//
//			}
//
//			try {
//				TotalLinks();
//			} catch (InterruptedException f) {
//				f.printStackTrace();
//
//			}
//
//		}
//		driver.close();
//	}
			}}
			}}
