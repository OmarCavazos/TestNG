package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day4 {
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String uname) {
		//Selenium
		System.out.println("WebloginHomePersonalLoan");
		System.out.println(uname);
				
	}

	@Test(groups = {"Smoke"})
	public void MobileLoginHomeLoan() {
		//Appium
		System.out.println("MobileLoginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		//RestAPI
		System.out.println("LoginAPIHome");
	}
}
