package crossBrowsersTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	WebDriver driver;

    @BeforeClass
    @Parameters("Browser")
    public void Setup(String browser) throws Exception {
    	if(browser.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
        }
        else {
            throw new Exception("Browser Not FOUND!!!!");
        }
    }
    @DataProvider(name="Valid_LoginData")
    public Object [][] data(){
        Object [][] data=new Object[3][2]; //Rc, Row, Column
        //Set 1
        data[0][0]="mail@mail.com";
        data[0][1]="123456";
        //Set 2
        data[1][0]="mail2@mail.com";
        data[1][1]="";
        //Set 3
        data[2][0]="";
        data[2][1]="123456";

        return data;
    }
    @Test(dataProvider ="Valid_LoginData")
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

     
       
        
    }
}
