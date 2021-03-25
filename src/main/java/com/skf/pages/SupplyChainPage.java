package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Pages;

public class SupplyChainPage extends Pages{
	public WebElement bearingDesignationLabel() {
		return driver.findElement(By.cssSelector("h2[title='Bearing Designation']"));
	}
	
	public WebElement customerNameLabel()
	{
		return driver.findElement(By.cssSelector("h2[title='Customer Name']"));
	}
	
	public WebElement comoCompanyNameLabel() {
		return driver.findElement(By.cssSelector("h2[title='CoMo Company Name']"));
	}
	
	public WebElement availabilityStatusLabel()
	{
		return driver.findElement(By.cssSelector("div[title='Availability Status']  .preTextWithEllipsis"));
	}
	
	public WebElement iFrame()
	{
		return driver.findElement(By.tagName("iframe"));
	}
	
	public WebElement selectedProjectNameLabel()
	{
		return driver.findElement(By.cssSelector("ul > .Breadcrumb-module_active__3VWxF"));
	}
	
	public WebElement tickIcon()
	{
		return driver.findElement(By.cssSelector(".IconCheck-module_iconCheck--circled__1_WLU.IconCheck-module_iconCheck__39ORN > .IconCheck-module_checkmark__aJzKM.IconCheck-module_drawAnimated__2ZSrJ"));
	}
	public WebElement bearingDesignationDropDown()
	{
		return driver.findElement(By.cssSelector(".droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern div[role='button'] > .slicer-restatement"));
	}
    public WebElement customerNameDropDown()
    {
    	return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(4) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderAbove visual-modern div[role='button'] > .slicer-restatement"));
    }
    
    public WebElement comoCompanyNameDropDown() {
    	
    	return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(1) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderAbove visual-modern div[role='button'] > .slicer-restatement"));
    }
     
    public WebElement availabilityStatusButton1()
    {
    	return driver.findElement(By.cssSelector(".row .cell:nth-of-type(1) .slicerItemContainer"));
    }
    public WebElement availabilityStatusButton2()
    {
    	return driver.findElement(By.cssSelector(".row .cell:nth-of-type(2) .slicerItemContainer"));
    }
    public WebElement availabilityStatusButton3()
    {
    	return driver.findElement(By.cssSelector(".row .cell:nth-of-type(3) .slicerItemContainer"));
    }
    public WebElement availabilityStatusButton4()
    {
    	return driver.findElement(By.cssSelector(".row .cell:nth-of-type(4) .slicerItemContainer"));
    }
    public WebElement availabilityStatusButton5()
    {
    	return driver.findElement(By.cssSelector(".row .cell:nth-of-type(5) .slicerItemContainer"));
    }
    public WebElement availabilityStatusButton6()
    {
    	return driver.findElement(By.cssSelector(".row .cell:nth-of-type(6) .slicerItemContainer"));
    }
    public WebElement availabilityStatuiFrame() {
    	return driver.findElement(By.cssSelector("[src='https\\:\\/\\/app\\.powerbi\\.com\\/13\\.0\\.15694\\.56\\/visualSandboxMinimal\\.html\\?\\=\\&plugin\\=ChicletSlicer1448559807354\\&locale\\=en-US']"));
    }
    
    public WebElement warehouseAvailabilitybyBearingDesignation() {
    	return driver.findElement(By.cssSelector("div[title^='Warehouse Availability by Bearing Designation (in next 5 day']  .preTextWithEllipsis"));
    }
    
    public WebElement warehouseAvailabilitybyBearingstobReplaced() {
    	return driver.findElement(By.cssSelector("div[title='Warehouse Availability by Bearings to be Replaced']  .preTextWithEllipsis"));
    }
    public WebElement availabilitybyWarehouse() {
    	return driver.findElement(By.cssSelector("div[title='Availability by Warehouse (in next 5 days)']"));
    }
    
    public WebElement eventsbyCompanyBearingDesignation() {
    	return driver.findElement(By.cssSelector("div[title='Events by Company & Bearing Designation']  .preTextWithEllipsis"));
    }
}
