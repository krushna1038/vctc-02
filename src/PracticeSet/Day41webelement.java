package PracticeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day41webelement {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\new driverchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement CrtBtn=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		CrtBtn.click();
		
		
		
		
		
		
		
		
		
	}

}
