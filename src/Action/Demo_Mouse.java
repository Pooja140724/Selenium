package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_Mouse {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/buttons/");
		
		driver.manage().window().maximize();
		
		
		// 1. Simple Click
		driver.findElement(By.id("pD03d")).click();
		
		Thread.sleep(5000);
		// 2. Right Click
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		Thread.sleep(5000);
		// 3. Double Click
		WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
		Thread.sleep(5000);
		// Object of Action class
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightClick).perform();
		
		act.doubleClick(doubleClick).perform();
		driver.close();

	}

}
