package JavaScirptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollby {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,900)");

driver.close();

	}

}
