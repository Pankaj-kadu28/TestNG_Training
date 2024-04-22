package ExecutionOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest {
	
	@Test
	public void first() {
		System.out.println("From First annotaed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("From Beforemethof annotation");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("From Aftermethod Annotation");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("From Before Class annotation");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("From AfterClass Annotation");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("From Aftertest annotation");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("From Aftersuite annotation");
	}
		
}
