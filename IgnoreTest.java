package learningTestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

  @Ignore
  @Test
	public void Signup() {
		System.out.println("SignUp");

	}

	@Test
	public void Login() {
		System.out.println("Login");
	}

	@Test
	public void SearchForTheFlight() {
		System.out.println("SearchForTheFlight");
	}
	
    @Ignore
	@Test
	public void BookTheFlight() {
		System.out.println("BookTheFlight");
	}
}
