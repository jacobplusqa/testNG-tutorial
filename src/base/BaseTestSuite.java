package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTestSuite {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Base Test Suite > Before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Base Test Suite > After class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Base Test Suite > Before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Base Test Suite > After test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Base Test Suite > before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Base Test Suite > after suite");
	}
	
	


	
	

}
