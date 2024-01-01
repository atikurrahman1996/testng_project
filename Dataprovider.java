package learningTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {

	WebDriver driver;

	@DataProvider(name = "LoginData")
	
	// we use three dimensional array [ 3 row & 2 column ]

	public Object[][] data() {

		Object[][] data = new Object[3][2]; // Row & column
		
		//  we provide one valid data and two invalid data for testing purposes
	

		// Set 1
		data[0][0] = "atikur2034rahman@gmail.com";
		data[0][1] = "Atik123";
		// Set 2
		data[1][0] = "atikur2034rahman@gmail.com";
		data[1][1] = "12345";
		// Set 3
		data[2][0] = "atikur2034rahman@gmail.com";
		data[2][1] = "A12345";

		return data;
	}

	@BeforeClass

	public void setUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@Test(dataProvider = "LoginData")

	public void loginTest(String email, String pass) throws InterruptedException {

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		Thread.sleep(3000);

		WebElement Email = driver.findElement(By.xpath("//input[@id='input-email']"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='input-password']"));

		WebElement LoginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));

		Email.clear();

		Email.sendKeys(email);
		Thread.sleep(3000);

		Password.clear();

		Password.sendKeys(pass);
		Thread.sleep(3000);

		LoginBtn.click();
		Thread.sleep(3000);
		
		driver.close();

	}
	
	
	
}






