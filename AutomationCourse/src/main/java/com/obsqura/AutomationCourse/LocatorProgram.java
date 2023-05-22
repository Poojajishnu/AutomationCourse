package com.obsqura.AutomationCourse;

import org.openqa.selenium.By;

public class LocatorProgram extends Base{
	public void idLocators()
	{
		    driver.findElement(By.id("twotabsearchtextbox"));
		    driver.findElement(By.id("glow-ingress-line1"));
		    driver.findElement(By.id("a-page"));
		    driver.findElement(By.id("nav-search-submit-button"));
		    driver.findElement(By.id("glow-ingress-line2"));
	}
		public void nameLocator()
		{
			driver.findElement(By.name("description"));
			driver.findElement(By.name("keywords"));
			driver.findElement(By.name("dropdown-selection"));
			driver.findElement(By.name("dropdown-selection-ubb"));
			driver.findElement(By.name("glow-validation-token"));
			
		}
		public void classLocator()
		{
			driver.findElement(By.className("navFooterColHead"));
			driver.findElement(By.className("navFooterLine"));
			driver.findElement(By.className("layoutToolbarPadding"));
			driver.findElement(By.className("icp-nav-link-inner"));
			driver.findElement(By.className("nav-line-1-container"));
		    
		}
		public void cssLocator()
		{
			driver.findElement(By.cssSelector("span#nav-search-submit-text"));
			driver.findElement(By.cssSelector("input#unifiedLocation1ClickAddress"));
			driver.findElement(By.cssSelector("span#glow-ingress-line1"));
			
			driver.findElement(By.cssSelector("span.hm-icon-label"));
			driver.findElement(By.cssSelector("div.nav-footer-line"));
			driver.findElement(By.cssSelector("span.icp-container-desktop"));
			
			driver.findElement(By.cssSelector("input[autocomplete='off']"));
			driver.findElement(By.cssSelector("input[type='submit']"));
			driver.findElement(By.cssSelector("div[role='presentation']"));
		}
public static void main(String args[])
{
	LocatorProgram program=new LocatorProgram();
	program.initializeBrowser();
	program.idLocators();
	program.nameLocator();
	program.classLocator();
	program.cssLocator();
	program.driverQuit();
	}
}


