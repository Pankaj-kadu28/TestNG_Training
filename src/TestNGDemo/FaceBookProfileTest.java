package TestNGDemo;

import org.testng.annotations.Test;

public class FaceBookProfileTest {

	FaceBookLogin facebookLogin = new FaceBookLogin();

	@Test
	public void testValidLogin() {
		facebookLogin.login("example_username", "example_password");
		// Add assertions or verification steps here
	}

	// Add more test methods as needed
}
