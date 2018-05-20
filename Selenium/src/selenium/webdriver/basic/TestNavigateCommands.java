package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigateCommands {

	WebDriver driver;

	public void invokeBrowser() {

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
			navigatecommands();
		} catch (Exception e) { // Surrounding with Try Catch to avoid Exception

			e.printStackTrace();
		}

	}
	
	public void navigatecommands() {
		try {
			driver.navigate().to("https://www.flipkart.com");
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			driver.findElement(By.xpath("//span[text()='TVs & Appliances']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Inverter AC']")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.navigate().refresh();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.close();
		
		
	}

	public static void main(String[] args) {
		
		TestNavigateCommands myObj = new TestNavigateCommands();
		myObj.invokeBrowser();
		

	}

}
