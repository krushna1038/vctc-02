package PracticeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day39Locaters {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\new driverchrome\\chromedriver.exe");
		// by id
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email"));
		driver.findElement(By.id("pass"));
		
		
		// by name
		driver.findElement(By.name("email"));
		driver.findElement(By.name("pass"));
		
		
		
		
		
	
		
		
	
		
		
		
		// by name

		
		
		
		
		
		
		
		
		
	}

}
