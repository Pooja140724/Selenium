package MyPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/PracticeAutomation/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("HOME")).click();
		
		driver.findElement(By.linkText("\"https://speedwaytech.co.in/testing-02/Select/\"")).click();
		driver.close();

	}

}
