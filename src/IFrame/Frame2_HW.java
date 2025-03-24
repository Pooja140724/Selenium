package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame2_HW {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://speedwaytech.co.in/testing-02/Frames/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// Handle to 1st frame by index
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");

		// Switching to inner frame that is frame 3
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		// jumping to frame 2
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement selectanimal = driver.findElement(By.id("animals"));
		// Create Object of Select Class
		Select sc = new Select(selectanimal);
		sc.selectByVisibleText("Baby Cat");
		Thread.sleep(2000);

		driver.quit();

	}

}
