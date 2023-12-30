package learningTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	@Test
	public void AssertGoogleSearch() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

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

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("Atikur Rahman", Keys.ENTER);
		Thread.sleep(5000);
		
		
		// Title assertions  > soft assertion 
		
		SoftAssert softAssert = new SoftAssert();
		
		String expTitle = "Get back on Facebook";
		String actTitle = driver.getTitle();
		
		softAssert.assertEquals(actTitle, expTitle, "Title is misMatch");
		
		// URL assertions > hard assertion
		
		String expURL = "https://www.facebook.com/";
		String actURL = driver.getCurrentUrl();
		
		softAssert.assertEquals(actURL, expURL, "URL is misMatch");
		
		//softAssert.assertAll();
		
		//driver.close();
		
		
		

	

		
	}

}

// Assert - hard assertion > will immediately though exceptions > next test will not execute if assertion failure

// SoftAssert > soft assertion > not immediately though exceptions > next test will execute 

// expected title > TestNG Tutorials- Google Search
