package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingBackForwardRefereshButtton {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("gaurav.roy916275@gmail.com");
        
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content")).click();
        
        driver.navigate().back();
        
        driver.navigate().forward();
        
        try {
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        
        driver.navigate().refresh();

	}

}
