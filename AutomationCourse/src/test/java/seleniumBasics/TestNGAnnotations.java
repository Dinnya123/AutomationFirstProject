package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
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
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeclass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterclass");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforetest");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("aftertest");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("aftersuite");
	}
	
	
	
	
	

}
