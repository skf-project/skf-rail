package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Pages;

public class AnalyticsReimbursementPage extends Pages{
	
	public WebElement bearingByStatusGroupLabel()
	{
		return driver.findElement(By.cssSelector("div[title='Bearings by Status Group']  .preTextWithEllipsis"));
	}
	
	public WebElement bearingByReimbursementUnitLabel()
	{
		return driver.findElement(By.cssSelector("div[title='Bearings by Refurbishment Unit']  .preTextWithEllipsis"));
	}
	
	public WebElement bearingByCustomerLabel()
	{
		return driver.findElement(By.cssSelector("div[title='Bearings by Customer']  .preTextWithEllipsis"));
	}
	
	public WebElement bearingByDesignationLabel()
	{
		return driver.findElement(By.cssSelector("div[title='Bearings by Designation']  .preTextWithEllipsis"));
	}
	
	public WebElement customerLabel()
	{
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(5) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern  .card  .label > tspan"));
	}
	
	public WebElement batchesLabel()
	{
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(6) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern  .card  .label > tspan"));
	}
	
	public WebElement designationLabel()
	{
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(7) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern  .card  .label > tspan"));
	}
	
	public WebElement bearingLabel()
	{
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(8) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern  .card  .label > tspan"));
	}
	
	public WebElement scrappedLabel()
	{
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(9) > .bringToFront > .droppableElement.hideBorder.noVisualTitle.readMode.ui-droppable.unselectable.visualContainer.visualHeaderBelow visual-modern  .card  .label > tspan"));
	}
	
	public WebElement refurishedBearingLabel()
	{
		return driver.findElement(By.cssSelector("div[title='Reburbished Bearings']  .preTextWithEllipsis"));
	}
	
	public WebElement scrapRateGraphLabel()
	{
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(15) > .bringToFront > .droppableElement.hideBorder.readMode.ui-droppable.unselectable.visualContainer div[title='Scrap Rate']  .preTextWithEllipsis"));
	}
	
	public WebElement scrapRatePercentLabel()
	{
		return driver.findElement(By.cssSelector("visual-container-modern:nth-of-type(11) > .bringToFront > .droppableElement.hideBorder.readMode.ui-droppable.unselectable.visualContainer div[title='Scrap Rate']  .preTextWithEllipsis"));
	}
	
	public WebElement scrapBearingByComponentLabel()
	{
		return driver.findElement(By.cssSelector("div[title='Scrapped Bearings by Component']  .preTextWithEllipsis"));
	}
	
	public WebElement bearingByStatusGroupValue()
	{
		return driver.findElement(By.xpath("//*[@id=\"sandbox-host\"]//span[contains(text(),\"Refurbishment\")]"));
	}
	
	public WebElement DrillDownIcon()
	{
		return driver.findElement(By.cssSelector(".drillDownLevelGrouped.glyph-small.glyphicon.pbi-glyph-drilldowndisabled-nocircle"));
	}
	
	public WebElement DrillUpIcon()
	{
		return driver.findElement(By.cssSelector(".pbi-glyph-drillup-nocircle"));
	}
	
	public WebElement GoToNextLevelIcon()
	{
		return driver.findElement(By.cssSelector(".drillDownLevelGrouped.glyph-small.glyphicon.pbi-glyph-expand-nocircle"));
	}
	
	public WebElement ExpandDownOneAllHierarchyIcon()
	{
		return driver.findElement(By.cssSelector(".drillDownLevelGrouped.glyph-small.glyphicon.pbi-glyph-inline-drill-nocircle"));
	}
	
	public WebElement FilterIcon()
	{
		return driver.findElement(By.cssSelector(".vcFilterRestatementBtn"));
	}
	
	public WebElement FocusIcon()
	{
		return driver.findElement(By.cssSelector("[aria-label='Focus mode']"));
	}
	
	public WebElement MoreOptionIcon()
	{
		return driver.findElement(By.cssSelector(".glyph-small.glyphicon.pbi-glyph-more"));
	}
	
	public WebElement detailedBatchLabel()
	{
		return driver.findElement(By.cssSelector("div[title='Detailed Batch']  .preTextWithEllipsis"));
	}
	
	public WebElement filterDateMonth()
	{
		return driver.findElement(By.cssSelector("li:nth-of-type(1) strong"));
	}
	
	public WebElement filterDateYear()
	{
		return driver.findElement(By.cssSelector("li:nth-of-type(2) strong"));
	}
	
	public WebElement filterStatusGroup()
	{
		return driver.findElement(By.cssSelector("li:nth-of-type(3) strong"));
	}
	
	public WebElement backToReport()
	{
		return driver.findElement(By.cssSelector("[localize='VisualContainer_PopOut_BackToReportButton']"));
	}
	
	
	
	
	

	
}
