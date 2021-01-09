package com.skf.testcases;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Pages;
import com.skf.pages.AddNewProjectPage;
import com.skf.pages.HomePage;
import com.skf.pages.LoginPage;
import com.skf.pages.ProjectPage;
import com.skf.utilities.CommonUtilities;

public class Project extends Pages {

	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

	@Test(enabled=false)
	public void projectNavigation() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp=new HomePage();
		ProjectPage pp=new ProjectPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		assertTrue(hp.projectHeader().isDisplayed());
		hp.projectHeader().click();
		Thread.sleep(5000);
		assertTrue(pp.addNewProjectCaseLink().isDisplayed());
		assertTrue(pp.projectNameTableHeader().isDisplayed());
		assertTrue(pp.projectDescriptionTableHeader().isDisplayed());
		assertTrue(pp.ETO_IDTableHeader().isDisplayed());
		assertTrue(pp.countryTableHeader().isDisplayed());
		assertTrue(pp.editIconTableIcon().isDisplayed());
		assertTrue(pp.deleteTableIcon().isDisplayed());	
	}

	//@Test
	public void addNewProjectNavigation() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp=new HomePage();
		ProjectPage pp=new ProjectPage();
		AddNewProjectPage ap=new AddNewProjectPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		assertTrue(hp.projectHeader().isDisplayed());
		hp.projectHeader().click();
		Thread.sleep(5000);
		assertTrue(pp.addNewProjectCaseLink().isDisplayed());
		pp.addNewProjectCaseLink().click();
		Thread.sleep(5000);
		assertTrue(ap.projectCaseNameLable().getText().matches("Project Case Name"));
	}
	
	//@Test
	public void addNewProjectComponent() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp=new HomePage();
		ProjectPage pp=new ProjectPage(); new CommonUtilities();
		AddNewProjectPage ap=new AddNewProjectPage();
		CommonUtilities cp=new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		assertTrue(hp.projectHeader().isDisplayed());
		hp.projectHeader().click();
		Thread.sleep(5000);
		assertTrue(pp.addNewProjectCaseLink().isDisplayed());
		pp.addNewProjectCaseLink().click();
		Thread.sleep(5000);
		ap.projectCaseName().sendKeys("New Project");
		ap.projectCaseDescription().sendKeys("New Project Description");
		ap.ETOID().sendKeys("12345");
		ap.countryDropdown().click();
		ap.countryDropdownValue().click();
		ap.salesCheckbox().click();
		Thread.sleep(1000);
		cp.javaScriptClick(ap.refurbishmentCheckbox());
		Thread.sleep(1000);
		cp.javaScriptClick(ap.conditioningMonitoringCheckbox());
		ap.addWheelBearingDropDown().click();
		ap.addWheelBearingDropDownValue().click();
		ap.productTypeDropDown().click();
		ap.productTypeDropDownValue().click();
		ap.saleCustomerDropDown().click();
		ap.saleCustomerDropDownValue().click();
		ap.reburishmentCustomerDropDown().click();
		ap.reburishmentCustomerDropDownValue().click();
		ap.conditioningMonitoringDropDown().click();
		ap.conditioningMonitoringDropDownValue().click();
		ap.saleProductDesignationDropDown().click();
		ap.saleProductDesignationDropDownValue().click();
		ap.refurbishmentBearingDesignationDropDown().click();
		ap.refurbishmentBearingDesignationDropDownValue().click();
		ap.conditioningMonitoringBearingDesignationDropDown().click();
		ap.conditioningMonitoringBearingDesignationDropDownValue().click();
		ap.addButton().click();
		Thread.sleep(2000);
		assertTrue(ap.verifyTableContent().getText().matches("CoMo Sales"));
		ap.deleteIcon().click();
		ap.discardButton().click();		
	}
	
	@Test
	public void addNewProjectSaveEditFuntionality() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp=new HomePage();
		ProjectPage pp=new ProjectPage(); new CommonUtilities();
		AddNewProjectPage ap=new AddNewProjectPage();
		CommonUtilities cp=new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		assertTrue(hp.projectHeader().isDisplayed());
		hp.projectHeader().click();
		Thread.sleep(5000);
		assertTrue(pp.addNewProjectCaseLink().isDisplayed());
		pp.addNewProjectCaseLink().click();
		Thread.sleep(5000);
		ap.projectCaseName().sendKeys("New Project");
		ap.projectCaseDescription().sendKeys("New Project Description");
		ap.ETOID().sendKeys("12345");
		ap.countryDropdown().click();
		ap.countryDropdownValue().click();
		ap.salesCheckbox().click();
		Thread.sleep(1000);
		cp.javaScriptClick(ap.refurbishmentCheckbox());
		Thread.sleep(1000);
		cp.javaScriptClick(ap.conditioningMonitoringCheckbox());
		ap.addWheelBearingDropDown().click();
		ap.addWheelBearingDropDownValue().click();
		ap.productTypeDropDown().click();
		ap.productTypeDropDownValue().click();
		ap.saleCustomerDropDown().click();
		ap.saleCustomerDropDownValue().click();
		ap.reburishmentCustomerDropDown().click();
		ap.reburishmentCustomerDropDownValue().click();
		ap.conditioningMonitoringDropDown().click();
		ap.conditioningMonitoringDropDownValue().click();
		ap.saleProductDesignationDropDown().click();
		ap.saleProductDesignationDropDownValue().click();
		ap.refurbishmentBearingDesignationDropDown().click();
		ap.refurbishmentBearingDesignationDropDownValue().click();
		ap.conditioningMonitoringBearingDesignationDropDown().click();
		ap.conditioningMonitoringBearingDesignationDropDownValue().click();
		ap.addButton().click();
		Thread.sleep(5000);
		assertTrue(ap.verifyTableContent().getText().matches("CoMo Sales"));
		ap.saveButton().click();
		Thread.sleep(5000);
		assertTrue(pp.addNewProjectCaseLink().isDisplayed());
		pp.editIconTableIcon().click();
		ap.discardButton().click();
		Thread.sleep(5000);
		assertTrue(pp.addNewProjectCaseLink().isDisplayed());
		pp.deleteTableRecordIcon().click();
		pp.deleteButtonOnPopUp().click();
	}
	
	
	@AfterMethod
	public void tearDown() {
		Pages.driver.close();
		driver=null;
		log.debug("Browser closed");
	}

}
