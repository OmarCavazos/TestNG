package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void ploan() {
		System.out.println("Bye");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("This will execute before every Test");
	}

}
