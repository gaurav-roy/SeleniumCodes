package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseElementLocatorTechniques {
	
	WebDriver driver;
	
	public void invokeBrowser(String url) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\GAURAV\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
            // delete all cookies
			driver.manage().deleteAllCookies();
			// maximizes the window
			driver.manage().window().maximize();
			// concept of Implicitly wait command
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// concept of Timeout of Page
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(url);
		} catch (Exception e) { // Surrounding with Try Catch to avoid Exception

			e.printStackTrace();
		}

	}
	
	 public void elementLocatorTechniques() {
		 try {
			 invokeBrowser("http://www.amazon.in");
			 // By linkText loacator Technque
			 driver.findElement(By.linkText("Your Amazon.in")).click();
			 driver.navigate().back();
			 // By ID loactor technique
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("HP Laptops");
			// By className locator technique
			 driver.findElement(By.className("nav-input")).click();
			 driver.navigate().back();
			 // By partialLinkText locator Technique
			 driver.findElement(By.partialLinkText("Customer")).click();
			 //Thread.sleep(3000); // this sleep just to look that it search HP laptops or not. Just can avoid.
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
		 
	 }
	 
	 public void elementLocatorTechniquesUsingFacebook() {
		 
		 try {
			invokeBrowser("http://www.facebook.com");
			// By name loactor technique
			 driver.findElement(By.name("firstname")).sendKeys("Gaurav");
			 // by cssSelectot technique
			 driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	 public void closeBrowser() {
		 driver.close();
	 }
	
	public static void main(String[] args) {
		UseElementLocatorTechniques obj = new UseElementLocatorTechniques();
		//obj.elementLocatorTechniques();
		//obj.closeBrowser();
		obj.elementLocatorTechniquesUsingFacebook();
		
		

	}

}
