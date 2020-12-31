package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Pages;

public class ProjectPage extends Pages {

	public WebElement addNewProjectCaseLink() {
		return driver.findElement(By.cssSelector(".ListProjectData_addNew__o8Qvb.ListProjectData_clickable__1IIGE > div"));
	}
	
	public WebElement projectNameTableHeader() {
		return driver.findElement(By.cssSelector(".ListProjectData_addNew__o8Qvb.ListProjectData_clickable__1IIGE > div"));
	}
	
	public WebElement projectDescriptionTableHeader() {
		return driver.findElement(By.cssSelector("thead [colspan='1']:nth-of-type(2) span:nth-of-type(1)"));
	}
	
	public WebElement ETO_IDTableHeader() {
		return driver.findElement(By.cssSelector("thead [colspan='1']:nth-of-type(3) span:nth-of-type(1)"));
	}
	
	
	public WebElement countryTableHeader() {
		return driver.findElement(By.cssSelector("thead [colspan='1']:nth-of-type(4) span:nth-of-type(1)"));
	}
	
	public WebElement editIconTableIcon() {
		return driver.findElement(By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(5) > div > svg:nth-of-type(1)"));
	}
	public WebElement deleteTableIcon() {
		return driver.findElement(By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(5) > div > svg:nth-of-type(2)"));
	}
	
	
	
	

}
