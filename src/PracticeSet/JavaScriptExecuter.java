package PracticeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;



public class JavaScriptExecuter {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\new chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//drawing border around element
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement TryitBtn=driver.findElement(By.xpath("//button[text()='Try it']"));
	   
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("scroll(0,1000)");
		
		
		
		
	
		
		
		
		
		
		
	}

}
