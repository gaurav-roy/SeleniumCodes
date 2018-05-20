package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
    
	//Pre-Conditions annotations-- starting with @Before
	@BeforeSuite() //1.
	public void setup() {
		System.out.println("@BeforeSuite---setupsystem property for chrome");

	}

	@BeforeClass //3
	public void login() {
		System.out.println("@BeforeClass---login to app");
	}

	@BeforeTest()//2
	public void launchBrowser() {
		System.out.println("@BeforeTest---launchBrowser");
	}

	@BeforeMethod  //4
	public void enterURL() {
		System.out.println("@BeforeMethod---Enter URL");

	}

	//test cases---starting with @Test--Here only one @Test is present that means we wrote only one test case
	@Test  //5
	public void googleTitleTest() {
		System.out.println("@Test---Google Title Test");
	}
	
	@Test  
	public void searchTest() {
		System.out.println("@Test---searchTest");
	}
	
	@Test  
	public void googleLogoTest() {
		System.out.println("@Test---googleLogoTest");
	}
    
    
	//Post Condition---starting with @After.
	@AfterMethod  //6
	public void logout() {
		System.out.println("@AfterMethod---logout from app");
	}
	
	@AfterTest //8
	public void deleteAllCokkies() {
		System.out.println("@AfterTest---deleteAllCokkies");
	}
	
	@AfterClass  //7
	public void closeBrowser() {
		System.out.println("@AfterClass---Close Browser");
	}
	
	@AfterSuite  //9
	public void generateTestReport() {
		System.out.println("generateTestReport");
	}

}
