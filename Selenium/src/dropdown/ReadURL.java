package dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadURL {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		
		// This command is used to find the current URL
		String url = driver.getCurrentUrl();
		
		System.out.println("The Current URL is: "+ url);
		
		System.out.println("The current Page source is: "+ driver.getPageSource());
		
		
	}

}
