package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_BeforeClassAnnotations {
	
	@BeforeClass
	public void setUp(){
		System.out.println("\nTHIS runs ONCE before class");
		
	}
	
	@AfterClass
public void cleanUp(){
	System.out.println("\nTHIS runs ONCE after class");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nTHIS runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nTHIS runs after every method");
	}
	
	
	@Test
	public void testMethodOne() {
		
		System.out.println("Running test > testMethodOne");
	}
	
	@Test
	public void testMethodTwo() {
		
		
		System.out.println("Running test > testMethodTwo");
	}

	

}
