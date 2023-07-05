package PracticeSet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlePractice {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\new chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		
		WebElement Alldrop=d.findElement(By.xpath("//select[@name='url']"));
		
		Select s=new Select(Alldrop);
		List<WebElement>option=s.getOptions();
		System.out.println("Number of element is"+option.size());
		int i;
		for(i=0;i<option.size();i++) {
			String options=option.get(i).getText();
			System.out.println(i+" "+options);
		}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				;
		
		
		
		
		
		
		
	}

}
