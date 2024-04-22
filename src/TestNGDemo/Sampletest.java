package TestNGDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Sampletest {

	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("Executing Befor test suite");

	}

	@AfterSuite
	public void aftereSuiteMethod() {
		System.out.println("Executing after test suite");

	}

}
