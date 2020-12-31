package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Pages;

public class HomePage extends Pages {

	public WebElement projectHeader() {
		return driver.findElement(By.cssSelector("li:nth-of-type(7) > a"));
	}
	
	

}
