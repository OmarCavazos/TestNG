package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day3 {
	@BeforeClass
	public void befoclas() {
		System.out.println("Before executing any methods in Day 3 class");
	}
	
	@AfterClass
	public void afclass() {
		System.out.println("After executing any methods in Day 3 class");
	}
	
	
	@Parameters({"URL", "APIKey/username"})
	@Test (groups = {"Smoke"})
	public void WebloginCarLoan(String urlname, String key) {
		//Selenium
		System.out.println("WebloginCar");
		System.out.println(urlname);
		
		System.out.println(key);
	}
	
	@BeforeMethod
	public void BfEvery() {
		System.out.println("I will execute before every test method in day 3 class <--- ");
	}
	
	@AfterMethod
	public void AfterEvery() {
		System.out.println("I will execute after every test method in day 3 class \n");
	}

	@Test
	public void MobileLoginCarLoan() {
		//Appium
		System.out.println("MobileLoginCarLoan");
	}
	@Test(enabled = false)
	public void MobileSignInCarLoan() {
		//Appium
		System.out.println("Mobile SIGNIN");
	}
	
	
	@Test(dataProvider = "getData")
	public void MobileSignOutCarLoan(String firstUsername, String firstPassword) {
		//Appium
		System.out.println("Mobile SIGNOUT");
		System.out.println(firstUsername);
		System.out.println(firstPassword);
		
	}
	
	@BeforeSuite
	public void BfSuite() {
		System.out.println("This will execute before everything <--- ");
	}
	
	@AfterSuite
	public void AfSuite() {
		System.out.println("This will execute at last <--- ");
	}
	
	@Test(dependsOnMethods = {"WebloginCarLoan"})
	public void APICarLoan() {
		//RestAPI
		System.out.println("LoginAPICarLoan");
	}
	
	@DataProvider
	public Object[][] getData() {
		// 1st combination -username, password - good history
		// 2nd combination -username, password - no credit history
		// 3rd combination -username, password - fraudulent credit history
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0] = "firstUserName";
		data[0][1] = "firstPassword";
		// columns in the row are nothing but values for that particular combination
		
		// 2nd set
		data[1][0] = "secondUserName";
		data[1][1] = "secondPassword";
		
		// 2nd set
		data[2][0] = "thirdUserName";
		data[2][1] = "thirdPassword";
		
		return data;
		
				
				
		}
	
}
