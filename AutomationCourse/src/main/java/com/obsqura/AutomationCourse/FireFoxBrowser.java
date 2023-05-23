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
		driver.manage().window().maximize();
	}
	public void driverClose()
	{
		driver.close();
	}
	public void titleGet()
	{
	String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	String actualTitle=driver.getTitle();
	System.out.println("expected result is:"+expectedTitle);
	System.out.println("actual result is:"+actualTitle);
	if(expectedTitle.equals(actualTitle))
	{
		System.out.println("test passed");
	}
	else
	{
		System.out.println("test failed");
	}
	}
	public void firefoxdriver()
	{
		String pagesource=driver.getPageSource();
	}
	public void UrlGet()
	{
		driver.getCurrentUrl();
	}
	public void naviagationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public void driverQuit()
	{
		driver.quit();
	}
	public static void main(String args[])
	{
		FireFoxBrowser firefoxdriver=new FireFoxBrowser();
		firefoxdriver.initializeBrowser();
		//firefoxdriver.driverClose();
		firefoxdriver.titleGet();
		firefoxdriver.firefoxdriver();
		firefoxdriver.UrlGet();
		firefoxdriver.naviagationCommands();
		firefoxdriver.driverQuit();		
	}
}
