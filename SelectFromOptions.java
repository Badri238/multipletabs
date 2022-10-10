package org.testng.annotations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectFromOptions {
	
	@Test
	public void Option() throws InterruptedException {
		
	
	 System.out.println("I am a Method! Test is starting!");
     //Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E://WEB_DEVELOPMENT//chromedriver.exe");
		//Creating an object of ChromeDriver
		 ChromeDriver driver = new ChromeDriver();
		//Go to the url
		 driver.get("https://www.makemytrip.com/flights");
         Thread.sleep(7000);
         

         WebElement dropdown= driver.findElement(By.xpath("//label[@for='fromCity']"));
         dropdown.click();
         String searchText ="Mumbai, India";
       
         Thread.sleep(2000);
       
     List<WebElement>options=dropdown.findElements(By.xpath("//li[@role='option']"));
     Thread.sleep(5000);
     for(WebElement element:options) {
   	  System.out.println(element.getText());
   	  System.out.println(element.getText().contains(searchText));
   	  if(element.getText().contains(searchText)) {
   		  element.click();
   		  break;
   	  }
   	  
     }
  
	}
}
