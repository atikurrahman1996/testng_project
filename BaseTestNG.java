package learningTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTestNG {
	
   @BeforeClass
	
	public void beforeClass() {
		
		System.out.println("I am from before class annotation");
	}
	
	
	@AfterClass
	
	public void afterClass() {
		
		System.out.println("I am from after class annotation");
	}
	
	  
    @BeforeMethod
    
    public static void beforeMethod() {
 		  
 		  
 		  System.out.println("I am from before method annotation");
 		  
    }
    
    @AfterMethod
    
    
    public static void afterMethod() {
  	  
  	  
  	  System.out.println("I am from after Method annotation");
  	  
    }
  	
  
  
	
        @Test
        public void test1() {
	  
	  System.out.println("I am from test annotation1");
	  
}
  
  
       @Test
  
       public void test2() {
	  
	  System.out.println("I am from test annotation2");
	  
	  
  }
  

     @BeforeTest
     public static void beforeTest() {
     
     System.out.println("I'm from Before Test");

}

    @AfterTest
  
    public static void afterTest() {
     
    System.out.println("I'm from After Test");
   

  
}
  
  
  
}



/*
 I'm from Before Test
 
I am from before class annotation

I am from before method annotation

I am from test annotation1

I am from after Method annotation
I am from before method annotation


I am from test annotation2

I am from after Method annotation

I am from after class annotation


I'm from After Test
 
 
 */
