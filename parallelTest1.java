package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTest1 {

	WebDriver driver;

	@BeforeClass

	public void setUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@Test()
	void logoTest() throws InterruptedException {
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(5000);
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		Assert.assertTrue(logo.isDisplayed());
		Thread.sleep(5000);
	}

	@Test()
	void homePageTitle() {
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");

		String expTitle = "OrangeHRM";
		String actTitle = driver.getTitle();

		Assert.assertEquals(expTitle, actTitle);
	}

}
