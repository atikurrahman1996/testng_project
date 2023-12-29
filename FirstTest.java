package learningTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstTest {
    @Test
    public void TestGoogle() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.google.com/");
	  
	  driver.manage().window().maximize();
	  
	  
	 driver.findElement(By.id("APjFqb")).sendKeys("TestNG Tutorials", Keys.ENTER);
	 
	 System.out.println(driver.getTitle());
	
	 Thread.sleep(5000);
	
	 driver.close();   
	  
  }
  

   @Test
   public void TestFacebook() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	  
	  driver.manage().window().maximize();
	  
	  
	 driver.findElement(By.id("email")).sendKeys("Atikur Rahman", Keys.ENTER);
	 
	System.out.println(driver.getTitle());
	
	Thread.sleep(5000);
	
	driver.close();
  } 
  
}
