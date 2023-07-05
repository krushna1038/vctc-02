package PracticeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePracticeDay42 {
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\new chromedriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		driver.switchTo().frame("iframeResult");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(iframe);
		
		WebElement clickme=driver.findElement(By.xpath("//button[@type='button']"));
		clickme.click();
		
	//	driver.switchTo().parentFrame();
	
		driver.switchTo().parentFrame();
		
		
	}

}
