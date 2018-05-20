package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumAllBrowsers {

	public static void main(String[] args) {
		
		//1.Firefox
		
		// For Firefox we need tom download Geckodriver.exe File
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\GAURAV\\Downloads\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		 * 
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gmail.com");*/
		
	
		
		
		
		
		//2.Chrome
		
		// For Chrome we need to download chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("gaurav.roy916275@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content")).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("grvroy143@");
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.close();
		driver.quit();
		
		
		
		//3. IE
		
		/*System.setProperty("webdriver.ie.driver", "C:\\Users\\GAURAV\\Downloads\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
		 
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.seleniumpoint.com");*/

	}

}
