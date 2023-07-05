package PracticeSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Day48windowHandle {
	public static void main(String[]args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\new chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//		String id=driver.getWindowHandle();
//		System.out.println(id);
	
		
		Set<String> winds=driver.getWindowHandles();
		Iterator<String>iterate=winds.iterator();
		String first_window=iterate.next();
		driver.switchTo().window(first_window);
		driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
		
		winds=driver.getWindowHandles();
		iterate=winds.iterator();
		iterate.next();
		String Second_window=iterate.next();
		System.out.println(Second_window);
		driver.switchTo().window(Second_window);
		System.out.println("Title of second window"+driver.getTitle());
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		
		
		
		
		
		
	}

}
