package MyPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action {

	public static void main(String[] args) throws InterruptedException {
		
		//open Browser
		WebDriver driver = new ChromeDriver();
		
		//open URL
		driver.get("https://speedwaytech.co.in/testing-02/buttons/");
		// Maximize windows
		driver.manage().window().maximize();
		
		//Find elements
		
		driver.findElement(By.partialLinkText("Buttons")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("pD03d")).click();
		Thread.sleep(3000);
	WebElement Rightclick=	driver.findElement(By.id("rightClickBtn"));
	Thread.sleep(3000);
	WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
			
			Thread.sleep(3000);	
			Actions act = new Actions(driver);
			
			act.contextClick(Rightclick).perform();
			
			act.doubleClick(doubleClick).perform();
			driver.close();
		
	}
	
}
