package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Pages;

public class AddNewProjectPage extends Pages {

	public WebElement projectCaseNameLable() {
		return driver.findElement(By.cssSelector(".ProjectDataWrapper_form__14x1C.ProjectDataWrapper_marginBottom__1sImm > div:nth-of-type(1) > .Label-module_label__31CMJ"));
	}
	
}
