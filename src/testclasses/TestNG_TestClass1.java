package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG_TestClass1 {
	@BeforeClass
	
	public void setUp(){
		System.out.println("\nThis runs once before class");
	}
	
	@AfterClass
	
	public void cleanUp(){
		System.out.println("\nThis runs once after class");
	}
	
	@BeforeMethod
	
	public void beforeMethod(){
		System.out.println("this runs before each method");
	}
	
	@AfterMethod
	
	public void afterMethod(){
		System.out.println("this runs after each method");
	}
	
	@Test
	
	public void testMethodOne(){
		System.out.println("running test > TestNG_TestClassOne > testMethodOne");
	}
	
	@Test
	
	public void testMethodTwo(){
		System.out.println("running test > TestNG_TestClassOne >  testMethodTwo");
	}
}
