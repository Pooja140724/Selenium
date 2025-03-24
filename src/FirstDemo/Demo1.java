package FirstDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver-win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.bitrix24.in");
	}

}
