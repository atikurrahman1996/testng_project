package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {

	WebDriver driver;

	@BeforeTest
	public void setUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	public void takeScreenshot(String fileName) throws IOException {
		// File
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		
		
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./screenshot/"+fileName+ "Image1.png");
		FileUtils.copyFile(sourceFile, destFile);
		System.out.println("Screenshot saved successfully");

	}

	
	@AfterTest
	public void tearDown() {

		driver.close();

	}
}
