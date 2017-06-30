package testclasses;

import java.io.Console;

import org.testng.Assert;
import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_Asserts {
	
	SomeClassToTest obj = new SomeClassToTest();

	@Test
	public void testSum() {
	System.out.println("Running test --> testSum");
	int result = obj.sumNumbers(1, 2);
	Assert.assertEquals(result, 3);
	
	
	}
	
	@Test
	public void testStrings(){
		System.out.println("Runnin test > testStrings");
		String expectedString = "Hello World";
		String result = obj.addStrings("Hello", "World");
		Assert.assertEquals(result, expectedString);
	}
	
	@Test
	public void testArrays(){
		System.out.println("Running test > testArrays");
		int[] expectedArray = {1,2,3};
		int [] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);
		
	}
}
