package WindowHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {

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
			driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf#");
			String parentWindow = driver.getWindowHandle();
			System.out.println("Parent Window id: " + parentWindow);

			driver.findElement(By.xpath("//text()[contains(.,'Book Meal')]/ancestor::a[1]")).click();
			driver.findElement(By.xpath("//a[text()='E-Catering']")).click();
			Thread.sleep(3000);

			Set<String> allWindows = driver.getWindowHandles();
			int windowSize = allWindows.size();
			System.out.println("Number of Windows o[pened by Selenium: " + windowSize);

			int i = 1;
			for (String window : allWindows) {
				System.out.println("Window id : " + i + " " + window);
				i++;
				if (!parentWindow.equalsIgnoreCase(window)) {
					driver.switchTo().window(window);
					driver.findElement(By.xpath("//*[@id=\"app\"]/div/section[2]/div[2]/input")).sendKeys("1234567890");
					
					Thread.sleep(3000);
					
				}
			}

			driver.switchTo().window(parentWindow);
			Thread.sleep(3000);
			driver.close();
			driver.quit();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Window1 obj = new Window1();
		obj.invokeBrowser();

	}

}
