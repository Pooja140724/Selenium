package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
WebDriver driver =  new ChromeDriver();
		
		driver.get("https://online.actitime.com/speedwaytech/login.do");
		
		driver.manage().window().maximize();
		
		// implicit wait -----> Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.name("username")).sendKeys("Speedwaytech74@gmail.com");
		
		driver.findElement(By.name("pwd")).sendKeys("Sujeet@123");
		
		driver.findElement(By.id("loginButton")).click();
		
		
		//Thread.sleep(10000);  // -----> This is Java Wait
		
		driver.findElement(By.id("logoutLink")).click();
		
		//Thread.sleep(10000); 
		driver.close();

	}

}
