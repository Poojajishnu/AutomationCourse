package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;

public class LocateByXpath extends Base {
	public void pathLocate()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));
		driver.findElement(By.xpath("//div[@id=\'nav-packard-glow-loc-icon\']"));
		driver.findElement(By.xpath("//a[@href='/ref=nav_logo']"));
		
		driver.findElement(By.xpath("//span[@id=\'glow-ingress-line1\']"));
		driver.findElement(By.xpath("//a[@href=\'/gp/bestsellers/?ref_=nav_cs_bestsellers\']"));
	}
	public void dynamicXpath()
	{
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtext')]"));
		driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtextbox')]"));
		driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		
		driver.findElement(By.xpath("//span[contains(@id,'glow-ingress-line2')]"));
		driver.findElement(By.xpath("//input[contains(@id,'search')]"));
		driver.findElement(By.xpath("//div[contains(@class,'layoutToolbarPadding')]"));
		driver.findElement(By.xpath("//div[contains(@id,'SponsoredLinks')]"));
		
		driver.findElement(By.xpath("//input[starts-with(@id,'nav-search-submit-button')]"));
		driver.findElement(By.xpath("//div[starts-with(@id,'gw-card')]"));
		driver.findElement(By.xpath("//a[starts-with(@id,'nav-logo')]"));
		driver.findElement(By.xpath("//meta[starts-with(@name,'google-site')]"));
		
		
		driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		driver.findElement(By.xpath("//a[text()='Home & Kitchen']"));
		driver.findElement(By.xpath("//a[text()='Beauty & Personal Care']"));
		driver.findElement(By.xpath("//a[text()='Kindle eBooks']"));
		driver.findElement(By.xpath("//a[text()=' Electronics ']"));
	}

	public static void main(String[] args) {
		LocateByXpath path=new LocateByXpath();
		path.initializeBrowser();
		path.pathLocate();
		path.dynamicXpath();
		path.driverQuit();
	

	}

}
