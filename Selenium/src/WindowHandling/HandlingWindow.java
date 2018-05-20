package WindowHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	WebDriver driver;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\GAURAV\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Windows.html");

			System.out.println("Main Window Title: " + driver.getTitle());

			driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
			Thread.sleep(3000);

			Set<String> windowIds = driver.getWindowHandles();

			Iterator<String> itr = windowIds.iterator();

			String mainWindow = itr.next();
			String childWindow = itr.next();
			driver.switchTo().window(childWindow);

			System.out.println("Child Window Title: " + driver.getTitle());
			Thread.sleep(3000);
			
			driver.switchTo().window(mainWindow);
			System.out.println("Main Window Title: " + driver.getTitle());

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

	public static void main(String[] args) {
		HandlingWindow obj = new HandlingWindow();
		obj.invokeBrowser();
		//obj.closeBrowser();

	}

}
