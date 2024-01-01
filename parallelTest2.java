package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTest2 {

	WebDriver driver;

	@BeforeClass

	void setUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@Test()
	void LoginTest() throws InterruptedException {
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

		Thread.sleep(5000);
	}
}
