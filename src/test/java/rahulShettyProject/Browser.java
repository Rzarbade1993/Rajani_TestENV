package rahulShettyProject;

import org.testng.annotations.AfterSuite;

public class Browser extends Login {

	@AfterSuite()
	public void Browserclose() {

		driver.quit();

	}
}
