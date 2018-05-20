package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
     WebDriver driver;
     
     public void invokeBrowser() {
    	 
    	 try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			 
			 //delete all cookies
			 driver.manage().deleteAllCookies();
			 
			 //maximizes the window
			 driver.manage().window().maximize();
			 
			 //concept of Implicitly wait command
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			 //concept of Timeout of Page
			 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			 
			 driver.get("http://www.facebook.com");
		} catch (Exception e) {   //Surrounding with Try Catch to avoid Exception
			
			e.printStackTrace();
		}
    	 
     }
     
	public static void main(String[] args) {
		
		Day1 myObj = new Day1();
		myObj.invokeBrowser();
		

	}

}
