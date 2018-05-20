package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GAURAV\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}

	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		// Assert is used to validate the actual and expected result. it is a very good
		// way to validate our test case
		Assert.assertEquals(title, "Google", "Title not Matched");
		// Assert.assertEquals(title, "Google123", "Title not Matched");
	}

	@Test
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		//this method is used to find if the condition is true then it will store the value of boolean b as true. or else it will show as false and the test case will fail.
		Assert.assertTrue(b);
		//this is also the same method. we can use any of them.
		//Assert.assertEquals(b, "true");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
