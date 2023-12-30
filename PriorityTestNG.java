package learningTestNG;

import org.testng.annotations.Test;

public class PriorityTestNG {

	@Test(priority = 1)
	public void Signup() {
		System.out.println("SignUp");

	}

	@Test(priority = 2)
	public void Login() {
		System.out.println("Login");
	}

	@Test(priority = 3)
	public void SearchForTheFlight() {
		System.out.println("SearchForTheFlight");
	}

	@Test(priority = 4)
	public void BookTheFlight() {
		System.out.println("BookTheFlight");
	}

	@Test(priority = 5)
	public void SaveTheTicket() {
		System.out.println("SaveTheTicket");
	}

	@Test(priority = 6)
	public void Logout() {
		System.out.println("Logout");
	}
	
	
	
	
	// Disable Test method - using enabled false 
	  
	  @Test(priority=7, enabled=false)
	  public static void Logout1() {
		  
		  System.out.println("Print Logout1");
	  }
	
	

		// Enable Test method - using enabled true 
		  
		  @Test(priority=7, enabled=true)
		  public static void Logout2() {
			  
			  System.out.println("Print Logout2");
		  }
		
	
	

}


// if you want to see how priority works change the priority number > default priority =0 , we can use negative priority like > -1
