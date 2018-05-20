package testNG;

//import org.testng.annotations.Test;
import org.testng.annotations.*;


public class TestAnnotations {
  @Test
  public void f1() {
	  System.out.println("Inside F1");
	  
  }
  
  @Test
  public void f2() {
	  System.out.println("Inside F2");
  }
  
  @BeforeTest
  public void beforeAnyTest() {
	  System.out.println("Before Ant Test");
  }
  
  @AfterTest
  public void afterAllTest() {
	  System.out.println("After all the Tests");
	  
  }
  
  @BeforeMethod
  public void beforeEveryMethod() {
	  System.out.println("before evert test method");
  }
  
  @AfterMethod
  public void afterEveryMethod() {
	  System.out.println("After every test method");
  }
  
  @BeforeClass
  public void beforClass() {
	  System.out.println("Before class");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }
}

