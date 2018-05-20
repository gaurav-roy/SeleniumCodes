package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AirIndiaDropDown {
	
ChromeDriver driver;
	
	public void AirIndia() {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("http://www.airindia.in/");
			
			driver.manage().window().maximize();
			
			Select name = new Select(driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UserLanguage1_drpCountry\"]")));
			
			/* select by Index
			name.selectByIndex(3);*/
			
			// select by Visible Text
			name.selectByVisibleText("UK");
			
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div[1]/div[4]/ul/li[2]/a")).click();
			
			// use to back any page
			driver.navigate().back();
			
			
			/*
			
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			
			Select text = new Select(driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UserLanguage1_ddlLanguage\"]")));
			
			text.selectByVisibleText("English");
			
			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_UserLanguage1_ibtnLanguageRefresh\"]")).click();
			
			*/
	
	}

	public static void main(String[] args) {
		
		AirIndiaDropDown myObj = new AirIndiaDropDown();
		
		myObj.AirIndia();

	}

}
