package Selenium_methods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Get_windowHandles {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/PracticeAutomation/");
		
		driver.manage().window().maximize();
		
		// Parent Window
		driver.findElement(By.xpath("//a[text()='Browser Windows']")).click();
		
		
		Thread.sleep(2000);
		// Child Window -1
		driver.findElement(By.id("tabButton")).click();
		
		Thread.sleep(2000);
		// Child Window -2
		driver.findElement(By.id("windowButton")).click();
		
		Thread.sleep(2000);
		// Child Window - 3
		driver.findElement(By.id("messageWindowButton")).click();
		
		// Set is a collection in java
		Set<String> windowIDs=driver.getWindowHandles();

		System.out.println("all windows IDs :" +windowIDs);
		
		Iterator <String> iterator =windowIDs.iterator();
		
		String ParentWindowID=iterator.next();
		System.out.println("ID of Parent Window is :" +ParentWindowID);
		
		String ChildWindowID1=iterator.next();
		System.out.println("ID of Child Window 1(Tab) is :" +ChildWindowID1);
		
		String ChildWindowID2=iterator.next();
		System.out.println("ID of Child Window 2(WindowButton) is :" +ChildWindowID2);
		
		String ChildWindowID3=iterator.next();
		System.out.println("ID of Child Window 3(messageWindowButton) is :" +ChildWindowID3);
		
		//If we want to close Childwindow 2
		
		Thread.sleep(3000);
		
		driver.switchTo().window(ChildWindowID2);
		
		Thread.sleep(2000);
		
		driver.close();
		
		//If we want to close parentwindow
		
		Thread.sleep(3000);
		driver.switchTo().window(ParentWindowID);
		
		Thread.sleep(3000);
		driver.close();
		
		
		//If we want to close all windows
		
		//driver.quit();
		


	}

}
