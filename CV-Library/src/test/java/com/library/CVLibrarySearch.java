package com.library;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.List;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CVLibrarySearch {
	
	WebDriver driver;

	@BeforeClass
	
	
	public void OpenUrl() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/venkysrav/Desktop/SeleniumJars/chromedriver");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.cv-library.co.uk/");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
	}
	
	@Test(priority=11)
	
	public void advancedsearchoption() throws InterruptedException {
		 
		 WebElement hovertomoresearchoption = driver.findElement(By.xpath("//span[text()='More Search Options']"));
		 
		 hovertomoresearchoption.click();
		 Thread.sleep(3000);
		 
		 
			List<WebElement> moresearchli = driver.findElements(By.xpath("//button[@id='toggle-hp-search']"));
			
			System.out.println(moresearchli.size());

			for(int i=0; i<moresearchli.size(); i++)
			
			{
			System.out.println(moresearchli.get(i).getText());
			
			}
		
		 driver.findElement(By.xpath("//button[@id='toggle-hp-search']")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("keywords")).sendKeys("automation tester");
		 
		 driver.findElement(By.id("location")).sendKeys("london");
		 
		 driver.findElement(By.xpath("//input[@id='hp-search-btn']")).click();
		 

	}
	
	
	
	@AfterClass
	
	public void closeurl()
	
	{
		driver.close();
		
	}

}
