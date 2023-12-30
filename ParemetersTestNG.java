package learningTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParemetersTestNG {

	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })

	public void InitialiseBrowser(String browser, String url) throws InterruptedException {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser specified");
		}

		driver.manage().window().maximize();
		driver.get(url);

		Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void LogoTest() throws InterruptedException {

		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));

		Thread.sleep(3000);

		Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page");
	}

	@Test(priority = 2)
	void homePageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
}

// to run this file > right click >myTestNG.xml file > Run with > TestNG suit 

// To run without XML file use> public void InitialiseBrowser(@Optional("chrome") String browser, @Optional("your_url_here") String url)
