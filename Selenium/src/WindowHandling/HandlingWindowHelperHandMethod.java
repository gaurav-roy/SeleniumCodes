package WindowHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowHelperHandMethod {

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

			switchToWindow(2);

			System.out.println("Child Window Title: " + driver.getTitle());
			Thread.sleep(3000);

			switchToWindow(1);

			System.out.println("Main Window Title: " + driver.getTitle());

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void switchToWindow(int index) {
		int i;
		String windowId = null;
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> itr = windowIds.iterator();

		for (i = 1; i <= index; i++) {
			windowId = itr.next();

		}
		driver.switchTo().window(windowId);
	}

	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

	public static void main(String[] args) {
		HandlingWindowHelperHandMethod obj = new HandlingWindowHelperHandMethod();
		obj.invokeBrowser();
		obj.switchToWindow(1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		obj.switchToWindow(2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		obj.closeBrowser();

	}

}
