package org.testng.annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumFunc {
	private WebDriver driver;
	
	@Test
	public void testFunction() throws InterruptedException {
		System.out.println("Testing Started!");
		System.setProperty("webdriver.chrome.driver", "E://WEB_DEVELOPMENT//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.xpath("//*[@name='username']"));
   		userName.sendKeys("Admin");
   		  
   		WebElement pass = driver.findElement(By.xpath("//*[@name='password']"));
   		pass.sendKeys("admin123");
   		
   		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
   		login.click();
   		// sleep for 3 seconds
   		Thread.sleep(3000);
//change below code	       		
   		WebElement welcomeMess = driver.findElement(By.xpath("//div[@id='branding']/a[@id='welcome']"));
   		String requ=welcomeMess.getText();
   		
   		System.out.println(requ.substring(8));


		
	}
}