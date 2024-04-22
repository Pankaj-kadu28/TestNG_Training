package ExecutionOrder;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 1)
	public void testMethod1() {
		// Test logic
	}

	@Test(priority = 2)
	public void testMethod2() {
		// Test logic
	}

	@Test(priority = 3)
	public void testMethod3() {
		// Test logic
	}

}
