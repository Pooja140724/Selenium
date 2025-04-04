package JavaScirptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_javaScript {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("persistent")).click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("document.getElementById('persistent').click()");

driver.close();
	}

}
