package org.testng.annotations;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	@Test
	public void MultipleTabsTest() throws InterruptedException {
		System.out.println("I am a Method! Test is starting!");
	      //Setting system properties of ChromeDriver
			System.setProperty("webdriver.chrome.driver", "E://WEB_DEVELOPMENT//chromedriver.exe");
			//Creating an object of ChromeDriver
			 ChromeDriver driver = new ChromeDriver();
			//Go to the url
			 driver.get("https://amazon.in");
	          Thread.sleep(7000);
	          
        String currentHandle=driver.getWindowHandle();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones", Keys.ENTER);
        driver.findElement(By.xpath("//span[contains(text(),'Sennheiser PC 8.2 Wired On Ear Headphones with Mic (Black)')]")).click();
	       
        Set <String> set=driver.getWindowHandles();
        
        for(String child : set) {
      	  if(!child.equalsIgnoreCase(currentHandle)) {
      		  driver.switchTo().window(child);
      		   Thread.sleep(7000);
		          driver.switchTo().window(currentHandle);
      	  }
        }
	}
}
