package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Pages;

public class LandingPage extends Pages {
	
	public WebElement skfLink() {
	
		return driver.findElement(By.cssSelector(".Header_header__2o8eo .Navigator-module_logo__1bP1h"));
	}

	public WebElement dashboardLabel()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]"));
	}
	
	public WebElement analyticsLabel() {
		return driver.findElement(By.xpath("//a[contains(text(),'Analytics')]"));
	}
	
	public WebElement supplyChainLabel()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Supply Chain')]"));
	}
	
	public WebElement projectsLabel()
	{
		return driver.findElement(By.xpath("//a[contains(text(),'Projects')]"));
	}
	
	public WebElement userRole() {
		return driver.findElement(By.cssSelector(".UserItem-module_userItem__2LLsr > .UserItem-module_userName__3cQ3Y"));
	}
	
	public WebElement welcomeNote()
	{
		return driver.findElement(By.xpath("//h1[normalize-space()='Welcome to SKF Rail Digital Transformation']"));
	}
	
	public WebElement dashboardTilesLabel()
	{
		return driver.findElement(By.xpath("//span[normalize-space()='Dashboard']"));
	}
	
	public WebElement salesTilesLable()
	{
	 return driver.findElement(By.xpath("//span[normalize-space()='Sales']"));
	}
	
	public WebElement refurbishmentTilesLabel()
	{
		return driver.findElement(By.xpath("//span[normalize-space()='Refurbishment']"));
	}
	
	public WebElement coMoTilesLabel()
	{
		return driver.findElement(By.xpath("//span[normalize-space()='CoMo']"));
	}
	
	public WebElement supplyChainTilesLabel()
	{
		return driver.findElement(By.xpath("//span[normalize-space()='Supply Chain']"));
	}
	
	public WebElement searchBox()
	{
		return driver.findElement(By.cssSelector(".SelectInputSearch-module_selectInputSearch__sNZEG.css-2b097c-container"));
	}
	
	public WebElement seeAllSearchResultLink()
	{
		return driver.findElement(By.xpath("//span[normalize-space()='See all search results']"));
	}
	
	public WebElement railDigitalTransformationLabel()
	{
		return driver.findElement(By.xpath("//label[normalize-space()='Rail Digital Transformation']"));
	}
	
	public WebElement searchBoxPlaceholder()
	{
		return driver.findElement(By.cssSelector("div[class='react-select__placeholder css-1wa3eu0-placeholder']"));
	}
	
	public WebElement projectDropDown()
	{
		return driver.findElement(By.cssSelector(".css-yk16xz-control.react-select__control"));
    }
	 
	public WebElement projectCasesLabel()
    {
		return driver.findElement(By.xpath("//h1[normalize-space()='Project cases']"));
    }
	public WebElement searchBoxFirstValue()
	{
		return driver.findElement(By.cssSelector("#react-select-2-option-0"));
	}
	public WebElement noOptions() {
		return driver.findElement(By.xpath("//div[@class='react-select__menu-list css-11unzgr']"));
	}
	
	public WebElement analyticsSales_Refurbishment_CoMolabel()
	{
		return driver.findElement(By.cssSelector(".Breadcrumb-module_active__3VWxF > a"));
	}
	
	public WebElement supplyChain_Dashboard_ProjectsLabel()
	{
		return driver.findElement(By.cssSelector(".Breadcrumb-module_breadcrumb__2Mkgj > .Common-module_container__CqzXF > ul  a"));
	}
	
	public WebElement skfRailLabel()
	{
		return driver.findElement(By.xpath("//div[@class='UserPopOver-module_userRoles__1f1KZ']"));
	}
	
	public WebElement logOutButton()
	{
		return driver.findElement(By.xpath("//div[@class='UserPopOver-module_userSignOut__ICXuf']"));
	}
	
	public WebElement userRoleLabel()
	{
		return driver.findElement(By.xpath("//div[@class='UserPopOver-module_userName__30m51']"));
	}
	
	public WebElement userRoleEmailId()
	{
		return driver.findElement(By.cssSelector(".UserPopOver-module_email__2l2q6"));
	}
	public WebElement dashboardTilesImage()
	{
		return driver.findElement(By.cssSelector("img[alt='Dashboard']"));
	}
	public WebElement salesTilesImage()
	{
		return driver.findElement(By.cssSelector("img[alt='Sales']"));
	}
	
	public WebElement refurbishmentTilesImage()
	{
		return driver.findElement(By.cssSelector("img[alt='Refurbishment']"));
	}
	
	public WebElement coMoTilesImage()
	{
		return driver.findElement(By.cssSelector("img[alt='CoMo']"));
	}
	
	public WebElement supplyChainTilesImage()
	{
		return driver.findElement(By.cssSelector("img[alt='Supply Chain']"));
	}
	
}
