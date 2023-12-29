package learningTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegANDLoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		  
		  driver = new ChromeDriver();
		  
		  driver.get("https://demo.opencart.com/index.php?route=account/register");
		  
		  driver.manage().window().maximize();
		
	}
	

	
	
  @Test
  public void Registration() throws InterruptedException {
	  
	    WebElement firstname= driver.findElement(By.xpath("//input[@id='input-firstname']"));
		
	    WebElement lastname= driver.findElement(By.xpath("//input[@id='input-lastname']"));
	    
	    WebElement email=driver.findElement(By.name("email"));
	    
	    WebElement password =driver.findElement(By.name("password"));
	    
	    Thread.sleep(3000);
	    
	    WebElement subscribeYes=driver.findElement(By.xpath("//input[@id='input-newsletter-yes']"));
	    
	    Thread.sleep(3000);
	    WebElement agree=driver.findElement(By.xpath("//input[@name='agree']"));
	    
	    Thread.sleep(3000);
	    
	    WebElement acregister=driver.findElement(By.cssSelector("button[type='submit']"));
	    
	    Thread.sleep(5000);
	    
	   // Action
	    
	    
	    firstname.sendKeys("ATIKUR");
	    
	    lastname.sendKeys("RAHMAN");
	    
	    email.sendKeys("atikur2036rahman@gmail.com");
	    
	    password.sendKeys("Atik123");
	    
	    Thread.sleep(3000);
	    
	    subscribeYes.click();
	    
	    Thread.sleep(3000);
	   
	    agree.click();
	    
	    Thread.sleep(3000);
	    
	    acregister.click(); 
	  
	  
	  
  }
  
  
	
	
  @Test
  
  public void login() throws InterruptedException {
	  
	  WebElement myAccount = driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
	    
	    myAccount.click(); 
	    
	    Thread.sleep(3000);
	    
	    //WebElement logout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
	    
	    //logout.click();
	    
	    WebElement loginClick =driver.findElement(By.xpath("//a[normalize-space()='Login']"));
	    
	    Thread.sleep(3000);
	   
	    loginClick.click();
	    
	    WebElement email1 = driver.findElement(By.name("email"));
		
	    WebElement password1 = driver.findElement(By.name("password"));
	 
		WebElement login= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
			
			
	 
		    Thread.sleep(3000);
			email1.sendKeys("atikur2034rahman@gmail.com");
			
			Thread.sleep(3000);
			password1.sendKeys("Atik123");
			
			Thread.sleep(3000);
			login.click();
			
	    
	  
	  
	  
  }
  
  
  
  
  
  
}
