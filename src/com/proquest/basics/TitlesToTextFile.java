package com.proquest.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TitlesToTextFile {

	@Test
	public void textfile() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preet\\eclipse-workspace\\ProQuest_Preethi\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		search.sendKeys("Proquest");
		search.sendKeys(Keys.ENTER);
		
		
		
		driver.quit();

	}
	

	
	

}
