package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
//	@Test
//	public void infiniteTestLoopTest() {
//		int i = 1;
//		while(i==1) {
//			System.out.println(i);
//		}
//	}

	
	@Test(expectedExceptions=NumberFormatException.class) //expectedException is used because we there is an error and still we need to pass the test case. this way is the method of using it.It is used only in TestNG, not in selenium.
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
	}
}
