package seleniumBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@Test
	public void testCase() {
		System.out.println("testcase");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	
	

}
