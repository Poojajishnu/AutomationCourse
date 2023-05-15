package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
	public WebDriver driver;
	public void initializeBrowser()
	{
		System.setProperty("webdriver.firefox.driver","D:\\Eclipse Sample\\AutomationCourse\\src\\main\\java\\resources\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}
	public static void main(String args[])
	{
		FireFoxBrowser firefoxdriver=new FireFoxBrowser();
		firefoxdriver.initializeBrowser();
		
	}

}
