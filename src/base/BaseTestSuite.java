package base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTestSuite {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Base Test Suite > Before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Base Test Suite > After class");
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
