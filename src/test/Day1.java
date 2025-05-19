package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	public void lastExecution() {
		System.out.println("This will execute after test: Personal Loan\n");
	}
	
    @Test
    public void demo() {
        System.out.println("Hello");
		Assert.assertTrue(false);
    }
    
    @Test
    public void secondTest() {
    	System.out.println("Good");
    }
}