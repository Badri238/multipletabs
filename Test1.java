package org.testng.annotations;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test1;
public class Test1{
	
	private WebDriver driver;

		 @Test
		 public void Startups() throws InterruptedException{

			 System.out.println("I am a Method! Test is starting!");
		      //Setting system properties of ChromeDriver
				System.setProperty("webdriver.chrome.driver", "E://WEB_DEVELOPMENT//chromedriver.exe");
				//Creating an object of ChromeDriver
				 driver = new ChromeDriver();
				//Go to the url
				 driver.get("https://dailyhunt.com");
		          Thread.sleep(7000);
		          
	       
		          
				 //Get the title and print it
//	          String ActualTitle = driver.getTitle();
//					 String ExpectedTitle = "(20+) Facebook";
//					 Assert.assertEquals(ExpectedTitle, ActualTitle);
//		        
		       
				 System.out.println(driver.getTitle());
				
				 Thread.sleep(7000);
				 driver.findElement(By.cssSelector("[title=\"Cricket\"]")).click();
				
				 System.out.println(driver.getCurrentUrl());

		 }
		 
	

				 

			}
