package com.proquest.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot extends BaseTest
{
	@Test
	public void ss() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preet\\eclipse-workspace\\ProQuest_Preethi\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		search.sendKeys("Proquest");
		search.sendKeys(Keys.ENTER);
		WebElement proquest = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3"));
		proquest.click();
		WebElement searchicon = driver.findElement(By.xpath("//*[@id=\"main-navbar-collapse\"]/ul[1]/li[8]/a/i"));
		searchicon.click();
		WebElement searchtext = driver.findElement(By.xpath("//*[@id=\"search-form\"]/div/span[1]/input[2]"));
		searchtext.sendKeys("QA");
		searchtext.sendKeys(Keys.ENTER);
		driver.quit();

	}

}
