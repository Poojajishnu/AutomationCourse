package com.obsqura.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
	public WebDriver driver;
	public void initialize()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse Sample\\AutomationCourse\\src\\main\\java\\resources\\msedgedriver.exe");
	
	
	driver=new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	
}
	public static void main(String args[])
	{
		EdgeBrowser edgebrowser = new EdgeBrowser();
		edgebrowser.initialize();
	}
}