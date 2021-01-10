package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Pages;

public class AnalyticsPage extends Pages{
	
	public WebElement analyticsSalesLabel()
	{
		return driver.findElement(By.cssSelector(".SubHeader-module_subHeader__2sKDZ.undefined > .Common-module_container__CqzXF > ul > li:nth-of-type(1) > a"));
	}

	public WebElement analyticsRefurbishmentLabel()
	{
		return driver.findElement(By.xpath("//a[normalize-space()='Refurbishment']"));
	}
	
	public WebElement analyticsCoMoLabel()
	{
		return driver.findElement(By.xpath("//a[normalize-space()='CoMo']"));
	}
	
	public WebElement iFrame()
	{
		return driver.findElement(By.cssSelector(".report > iframe"));
	}
	
	public WebElement grossValueByStatusGroupTitle()
	{
		return driver.findElement(By.cssSelector("div[title='Gross Value by Status Group']  .preTextWithEllipsis"));
	}
	
	public WebElement grossValueBySaleUnitTitle()
	{
		return driver.findElement(By.cssSelector("div[title='Gross Value by Sales Unit']  .preTextWithEllipsis"));
	}
	
	public WebElement grossValueByCustomerTitle()
	{
		return driver.findElement(By.cssSelector("div[title='Gross Value by Customer']  .preTextWithEllipsis"));
	}
	
	public WebElement grossValueByDesignationTitle()
	{
		return driver.findElement(By.cssSelector("div[title='Gross Value by Designation']  .preTextWithEllipsis"));
	}
	public WebElement grossValueAndPsValueTitle()
	{
		return driver.findElement(By.cssSelector("div[title='Gross Value and PS Value (SEK)']  .preTextWithEllipsis"));
	}
	
	public WebElement grossSalesSekTitle()
	{
		return driver.findElement(By.cssSelector("div[title='Gross Sales SEK']  .preTextWithEllipsis"));
	}
	
	public WebElement selectAllButton()
	{
		return driver.findElement(By.cssSelector("div[role='option'] > div[title='Select all']"));
	}
	
	public WebElement insightRailButton()
	{
		return driver.findElement(By.cssSelector("div[role='option'] > div[title='Insight Rail']"));
	}
	
	public WebElement othersButton() {
		return driver.findElement(By.cssSelector("div[role='option'] > div[title='Others']"));
	}
	
	public WebElement refurbishmentButton()
	{
		return driver.findElement(By.cssSelector("div[role='option'] > div[title='Refurbishment']"));
	}
	public WebElement remoteDiagnosticServicesButton() 
	{
		 return driver.findElement(By.cssSelector("div[role='option'] > div[title='Remote Diagnostic Services']"));
	}
	public WebElement tBUCTBUButton()
	{
		return driver.findElement(By.cssSelector("[title='TBU\\'s\\/CTBU\\'s']"));
	}
	
	public WebElement projectTickIcon()
	{
		return driver.findElement(By.cssSelector("div[class='IconCheck-module_checkmark__aJzKM IconCheck-module_drawAnimated__2ZSrJ']"));
	}
}
