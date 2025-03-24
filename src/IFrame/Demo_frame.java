package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rediff.com/");

		driver.manage().window().maximize();

		driver.switchTo().frame("moneyiframe");
		Thread.sleep(5000);

		String nseIndex = driver.findElement(By.id("nseindex")).getText();
		Thread.sleep(5000);

		System.out.println("Today's NSE Index Value is : "+nseIndex);
		
		Thread.sleep(2000);
		driver.close();

	}

}
