package dropdown;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropdown{
	
	ChromeDriver driver;
	
	public void amazondropdown() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			WebElement month_dropdown = driver.findElementById("month");
			
			// by using xpath
			
			Select month_dd = new Select(driver.findElementByXPath(("//*[@id=\"month\"]")));
			
			month_dd.selectByVisibleText("Dec");
			
			
			Thread.sleep(3000);
			
			
			WebElement day_dropdown = driver.findElementById("day");
			
			Select day_dd =new Select (day_dropdown);
			
			day_dd.selectByVisibleText("1");
	
			
			Thread.sleep(3000);
			
			WebElement year_dropdown = driver.findElementById("year");
			
			Select year_dd = new Select (year_dropdown);
			
			year_dd.selectByVisibleText("1995");
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public static void main(String[] args) {
		
		AmazonDropdown myObj = new AmazonDropdown();
		
		myObj.amazondropdown();

	}

}
