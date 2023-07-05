package PracticeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day37Webdriver {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\new driverchrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
	
		// to get current url
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		// to get current title
		String ExpectedTitle="Google";
		String gtl=driver.getTitle();
		System.out.println(gtl);
		
		if(ExpectedTitle.equalsIgnoreCase(gtl)) {
			System.out.println("Tastecase is passed");
		}else {
			System.out.println("Tastecase is failed");
			
		
			
			
			// maximize the browser.
			driver.manage().window().maximize();     /// you cannnot minimize of the browser.

			// navigate.
			driver.navigate().to("https://www.facebook.com/");
			driver.navigate().back();      /// google
			driver.navigate().forward();   /// facebook
			driver.navigate().refresh();
			
			
			
			Dimension d=new Dimension(100,300);
			driver.manage().window().setSize(d);
			
			driver.close();

			
			
		}
		
		
		
		
		
		
		
		
	}

}
