package PracticeSet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsPractice {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\new chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement crtbtn=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		crtbtn.click();
		
		
        	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
