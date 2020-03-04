package com.proquest.basics;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BaseTest {

	public static WebDriver driver = null;
	public WebDriverWait wait = null;
	public Logger log = Logger.getLogger(BaseTest.class);
}
