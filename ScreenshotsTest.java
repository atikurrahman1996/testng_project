package screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.Assert;
import org.testng.annotations.Test;



public class ScreenshotsTest extends baseTest {
	@Test
	public void AssertGoogleSearch() throws InterruptedException {

		driver.get("https://www.google.com/");

		Thread.sleep(3000);

		driver.findElement(By.id("APjFqb")).sendKeys("TestNG Tutorials", Keys.ENTER);
		
		// hard assertion 

		String expTitle = "TestNG Tutorials - Google Search";
		//String expTitle = "TestNG Tutorials - Google Search";  // failure assertion will immediately through exception

		String actTitle = driver.getTitle();

		Assert.assertEquals(expTitle, actTitle);

		Thread.sleep(5000);

		//driver.close();

	}

	@Test
	public void TestFacebook() throws InterruptedException {

		driver.get("https://www.facebook.com/");


		driver.findElement(By.id("email")).sendKeys("Atikur Rahman", Keys.ENTER);
		Thread.sleep(5000);
		
		
		// Title assertions
		
		String expTitle =  "Facebook";    // intentionally wrong expTitle given to fail the test
		String actTitle = driver.getTitle();
		
		Assert.assertEquals(actTitle, expTitle, "Title is misMatch");
		
		// URL assertions > hard assertion
		
		String expURL = "https://www.facebook.com/";
		String actURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actURL, expURL, "URL is misMatch");
		
		
		//driver.close();
		
		
		

	

		
	}
}
