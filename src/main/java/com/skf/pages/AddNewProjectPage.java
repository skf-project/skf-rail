package com.skf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.skf.base.Pages;

public class AddNewProjectPage extends Pages {

	public WebElement projectCaseNameLable() {
		return driver.findElement(By.cssSelector(".ProjectDataWrapper_form__14x1C.ProjectDataWrapper_marginBottom__1sImm > div:nth-of-type(1) > .Label-module_label__31CMJ"));
	}
	
	public WebElement projectCaseName() {
		return driver.findElement(By.cssSelector(".ProjectDataWrapper_inputLabel__ALy4V:nth-of-type(1) [type]"));
	}
	
	public WebElement projectCaseDescription() {
		return driver.findElement(By.cssSelector(".ProjectDataWrapper_inputLabel__ALy4V:nth-of-type(2) [type]"));
	}
	
	public WebElement ETOID() {
		return driver.findElement(By.cssSelector(".ProjectDataWrapper_inputLabel__ALy4V:nth-of-type(3) [type]"));
	}
	
	public WebElement countryDropdown() {
		return driver.findElement(By.cssSelector(".ProjectDataWrapper_marginBottom__1sImm [class='css-19bqh2r']"));
	}
	
	public WebElement countryDropdownValue() {
		return driver.findElement(By.cssSelector("#react-select-3-option-1"));
	}
	
	public WebElement salesCheckbox() {
		return driver.findElement(By.cssSelector(".Checkbox-module_square__d09q2:nth-of-type(5) .Checkbox-module_circle__2QsVz"));
	}
	
	public WebElement refurbishmentCheckbox() {
		return driver.findElement(By.cssSelector(".Checkbox-module_square__d09q2:nth-of-type(6) .Checkbox-module_innerCircle__2HYbP"));
	}
	
	public WebElement conditioningMonitoringCheckbox() {
		return driver.findElement(By.cssSelector(".Checkbox-module_square__d09q2:nth-of-type(7) .Checkbox-module_innerCircle__2HYbP"));
	}
	
	public WebElement addWheelBearingDropDown() {
		return driver.findElement(By.cssSelector(".WheelBearingDesignationForm_first__3n4h3 [class='css-19bqh2r']"));
	}

	public WebElement addWheelBearingDropDownValue() {
		return driver.findElement(By.cssSelector("#react-select-4-option-0"));
	}
	
	public WebElement productTypeDropDown() {
		return driver.findElement(By.cssSelector(".WheelBearingDesignationForm_second__15HpF > .WheelBearingDesignationForm_inputLabel__33JDY:nth-of-type(1) [class='css-19bqh2r']"));
	}
	
	public WebElement productTypeDropDownValue() {
		return driver.findElement(By.cssSelector("#react-select-5-option-0"));
	}
	
	public WebElement saleCustomerDropDown() {
		return driver.findElement(By.cssSelector(".WheelBearingDesignationForm_second__15HpF div:nth-of-type(2) .WheelBearingDesignationForm_inputLabel__33JDY > div:nth-of-type(2) [class='css-19bqh2r']"));
	}
	
	public WebElement saleCustomerDropDownValue() {
		return driver.findElement(By.cssSelector("#react-select-6-option-0"));
	}
	
	public WebElement reburishmentCustomerDropDown() {
		return driver.findElement(By.cssSelector(".WheelBearingDesignationForm_second__15HpF div:nth-of-type(3) .WheelBearingDesignationForm_inputLabel__33JDY > div:nth-of-type(2) [class='css-19bqh2r']"));
	}
	
	public WebElement reburishmentCustomerDropDownValue() {
		return driver.findElement(By.cssSelector("#react-select-8-option-0"));
	}
	
	public WebElement conditioningMonitoringDropDown() {
		return driver.findElement(By.cssSelector(".WheelBearingDesignationForm_second__15HpF div:nth-of-type(4) .WheelBearingDesignationForm_inputLabel__33JDY > div:nth-of-type(2) [class='css-19bqh2r']"));
	}
	
	public WebElement conditioningMonitoringDropDownValue() {
		return driver.findElement(By.cssSelector("#react-select-10-option-0"));
	}
	
	public WebElement saleProductDesignationDropDown() {
		return driver.findElement(By.cssSelector(".WheelBearingDesignationForm_second__15HpF div:nth-of-type(2) div:nth-of-type(4) [class='css-19bqh2r']"));
	}
	
	public WebElement saleProductDesignationDropDownValue() {
		return driver.findElement(By.cssSelector("#react-select-7-option-0"));
	}
	
	public WebElement refurbishmentBearingDesignationDropDown() {
		return driver.findElement(By.cssSelector(".WheelBearingDesignationForm_second__15HpF div:nth-of-type(3) div:nth-of-type(4) [class='css-19bqh2r']"));
	}
	
	public WebElement refurbishmentBearingDesignationDropDownValue() {
		return driver.findElement(By.cssSelector("#react-select-9-option-0"));
	}
	
	public WebElement conditioningMonitoringBearingDesignationDropDown() {
		return driver.findElement(By.cssSelector(".WheelBearingDesignationForm_second__15HpF div:nth-of-type(4) div:nth-of-type(4) [class='css-19bqh2r']"));
	}
	
	public WebElement conditioningMonitoringBearingDesignationDropDownValue() {
		return driver.findElement(By.cssSelector("#react-select-11-option-0"));
	}
	
	public WebElement addButton() {
		return driver.findElement(By.cssSelector(".WheelBearingDesignationForm_third__27lvB .ButtonPrimary-module_buttonPrimary__20LPd"));
	}
	
	public WebElement verifyTableContent() {
		return driver.findElement(By.cssSelector("tr[role='row'] > td:nth-of-type(2)"));
	}
	
	public WebElement deleteIcon() {
		return driver.findElement(By.cssSelector(".Icons_skfIcon__WcutW.WheelBearingDesignationList_clickable__URBHJ"));
	}

	public WebElement discardButton() {
		return driver.findElement(By.cssSelector(".ProjectDataWrapper_buttons__13erH .ButtonPrimary-module_outline__3mO8D"));
	}
	
	public WebElement saveButton() {
		return driver.findElement(By.cssSelector(".ProjectDataWrapper_buttons__13erH .ButtonPrimary-module_buttonNormal__FSut6:nth-of-type(1)"));
	}
	

	
}
