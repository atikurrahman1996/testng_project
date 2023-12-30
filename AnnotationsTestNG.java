package learningTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTestNG {
	
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("This will be executed before suite");
	}

	@AfterSuite
	void afterSuite() {
		System.out.println("This will be executed after suite");
	}

	@BeforeTest
	void beforeTest() {
		System.out.println("This will execute before test");
	}

	@AfterTest
	void afterTest() {
		System.out.println("This will execute after test");
	}

	@BeforeClass
	void beforeClass() {
		System.out.println("This will execute before class");
	}

	@AfterClass
	void afterClass() {
		System.out.println("This will execute after class");
	}

	@BeforeMethod
	void beforeMethod() {
		System.out.println("This will execute before every Method");
	}

	@AfterMethod
	void afterMethod() {
		System.out.println("This will execute after every test Method");

	}

	@Test
	public void test1() {

		System.out.println("This is test case 1");

	}

	@Test()
	void test2() {
		System.out.println("This is test case 2");
	}
}


// Note: testNG annotations is not mandatory to used, we can use annotations based on requirements 
