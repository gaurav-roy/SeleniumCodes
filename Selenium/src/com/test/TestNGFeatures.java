package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		//int i = 9/0;  // it will make test case fail so the dependency method will be skipped
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest() {
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest() {
		System.out.println("Search Page Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest() {
		System.out.println("Reg Page Test");
	}
	
	

}
