package ExecutionOrder;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SampleTestingUsage {
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("From BeforeTest annotation");
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("From BeforeSuite annotation");
	}

}
