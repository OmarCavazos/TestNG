package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@AfterTest
	public void lastExecution() {
		System.out.println("This will execute after test: Personal Loan <--- \n");
	}
	
    @Test
    public void demo() {
        System.out.println("Hello");
    }
    
    @Test
    public void secondTest() {
    	System.out.println("Good");
    }
}