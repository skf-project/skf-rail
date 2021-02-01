package com.skf.testcases;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class ProjectCreationScenario extends Pages {

	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

	@Test
	public void projectScenario1() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp = new HomePage();
		Robot rc = new Robot();
		ProjectPage pp = new ProjectPage();
		new CommonUtilities();
		AddNewProjectPage ap = new AddNewProjectPage();
		CommonUtilities cp = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
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
		cp.javaScriptExecutorType("Spain");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.salesCheckbox().click();
		Thread.sleep(1000);
		cp.javaScriptClick(ap.refurbishmentCheckbox());
		Thread.sleep(1000);
		cp.javaScriptClick(ap.conditioningMonitoringCheckbox());
		ap.addWheelBearingDropDown().click();
		cp.javaScriptExecutorType("BT2-8690 BE-01");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.productTypeDropDown().click();
		cp.javaScriptExecutorType("Refurbishment Sales");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.saleCustomerDropDown().click();
		cp.javaScriptExecutorType("1194080");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.reburishmentCustomerDropDown().click();
		cp.javaScriptExecutorType("RENFE");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.refurbishmentBearingDesignationDropDown().click();
		cp.javaScriptExecutorType("BT2-8690 BE-01");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.addButton().click();
	}

	@Test
	public void projectScenario2() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp = new HomePage();
		Robot rc = new Robot();
		ProjectPage pp = new ProjectPage();
		new CommonUtilities();
		AddNewProjectPage ap = new AddNewProjectPage();
		CommonUtilities cp = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
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
		cp.javaScriptExecutorType("Spain");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.salesCheckbox().click();
		Thread.sleep(1000);
		cp.javaScriptClick(ap.refurbishmentCheckbox());
		Thread.sleep(1000);
		cp.javaScriptClick(ap.conditioningMonitoringCheckbox());
		ap.addWheelBearingDropDown().click();
		cp.javaScriptExecutorType("BT2-8690 BE-01");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.productTypeDropDown().click();
		cp.javaScriptExecutorType("New Bearing Sales");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.saleCustomerDropDown().click();
		cp.javaScriptExecutorType("24117");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.reburishmentCustomerDropDown().click();
		cp.javaScriptExecutorType("RENFE");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.saleProductDesignationDropDown().click();
		cp.javaScriptExecutorType("BT2-8690 BE-01");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.addButton().click();
	}

	@Test
	public void projectScenario3() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp = new HomePage();
		Robot rc = new Robot();
		ProjectPage pp = new ProjectPage();
		new CommonUtilities();
		AddNewProjectPage ap = new AddNewProjectPage();
		CommonUtilities cp = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
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
		cp.javaScriptExecutorType("Spain");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.salesCheckbox().click();
		Thread.sleep(1000);
		cp.javaScriptClick(ap.refurbishmentCheckbox());
		Thread.sleep(1000);
		cp.javaScriptClick(ap.conditioningMonitoringCheckbox());
		ap.addWheelBearingDropDown().click();
		cp.javaScriptExecutorType("BT2-8690 BE-01");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.productTypeDropDown().click();
		cp.javaScriptExecutorType("CoMo Sales");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.saleCustomerDropDown().click();
		cp.javaScriptExecutorType("1194080");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.saleProductDesignationDropDown().click();
		cp.javaScriptExecutorType("Remote Diagnostic Services");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.conditioningMonitoringDropDown().click();
		cp.javaScriptExecutorType("CIVIA");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.conditioningMonitoringBearingDesignationDropDown().click();
		cp.javaScriptExecutorType("SKF");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.addButton().click();
	}

	@Test
	public void projectScenario4() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp = new HomePage();
		Robot rc = new Robot();
		ProjectPage pp = new ProjectPage();
		new CommonUtilities();
		AddNewProjectPage ap = new AddNewProjectPage();
		CommonUtilities cp = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
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
		cp.javaScriptExecutorType("United Kingdom");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.salesCheckbox().click();
		Thread.sleep(1000);
		cp.javaScriptClick(ap.refurbishmentCheckbox());
		Thread.sleep(1000);
		cp.javaScriptClick(ap.conditioningMonitoringCheckbox());
		ap.addWheelBearingDropDown().click();
		cp.javaScriptExecutorType("1639609 BE-01");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.productTypeDropDown().click();
		cp.javaScriptExecutorType("CoMo Sales");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.saleCustomerDropDown().click();
		cp.javaScriptExecutorType("1221578");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.saleProductDesignationDropDown().click();
		cp.javaScriptExecutorType("SKF Premium");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.addButton().click();
		Thread.sleep(10000);
	}

	@Test
	public void projectScenario5() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp = new HomePage();
		Robot rc = new Robot();
		ProjectPage pp = new ProjectPage();
		new CommonUtilities();
		AddNewProjectPage ap = new AddNewProjectPage();
		CommonUtilities cp = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
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
		cp.javaScriptExecutorType("United Kingdom");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.salesCheckbox().click();
		Thread.sleep(1000);
		cp.javaScriptClick(ap.refurbishmentCheckbox());
		Thread.sleep(1000);
		cp.javaScriptClick(ap.conditioningMonitoringCheckbox());
		ap.addWheelBearingDropDown().click();
		cp.javaScriptExecutorType("1639609 BE-01");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.productTypeDropDown().click();
		cp.javaScriptExecutorType("CoMo Sales");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.saleCustomerDropDown().click();
		cp.javaScriptExecutorType("1221578");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.conditioningMonitoringDropDown().click();
		cp.javaScriptExecutorType("GTR");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.conditioningMonitoringBearingDesignationDropDown().click();
		cp.javaScriptExecutorType("WSP 1639609 CA-10");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.addButton().click();
	}

	@Test
	public void projectScenario6() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp = new HomePage();
		Robot rc = new Robot();
		ProjectPage pp = new ProjectPage();
		new CommonUtilities();
		AddNewProjectPage ap = new AddNewProjectPage();
		CommonUtilities cp = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
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
		cp.javaScriptExecutorType("United Kingdom");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.salesCheckbox().click();
		Thread.sleep(1000);
		cp.javaScriptClick(ap.refurbishmentCheckbox());
		Thread.sleep(1000);
		cp.javaScriptClick(ap.conditioningMonitoringCheckbox());
		ap.addWheelBearingDropDown().click();
		cp.javaScriptExecutorType("1639609 BE-01");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.productTypeDropDown().click();
		cp.javaScriptExecutorType("New Bearing Sales");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.saleCustomerDropDown().click();
		cp.javaScriptExecutorType("1221578");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.saleProductDesignationDropDown().click();
		cp.javaScriptExecutorType("1639609 BE-01");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.addButton().click();
	}

	
	@Test
	public void projectScenario7() throws IOException, InterruptedException, AWTException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp = new HomePage();
		Robot rc = new Robot();
		ProjectPage pp = new ProjectPage();
		new CommonUtilities();
		AddNewProjectPage ap = new AddNewProjectPage();
		CommonUtilities cp = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
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
		cp.javaScriptExecutorType("Italy");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.salesCheckbox().click();
		Thread.sleep(1000);
		cp.javaScriptClick(ap.refurbishmentCheckbox());
		Thread.sleep(1000);
		cp.javaScriptClick(ap.conditioningMonitoringCheckbox());
		ap.addWheelBearingDropDown().click();
		cp.javaScriptExecutorType("1639135 C");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.productTypeDropDown().click();
		cp.javaScriptExecutorType("Refurbishment Sales");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.saleCustomerDropDown().click();
		cp.javaScriptExecutorType("83841");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.saleProductDesignationDropDown().click();
		cp.javaScriptExecutorType("1639135 C/R30");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.reburishmentCustomerDropDown().click();
		cp.javaScriptExecutorType("Lucchini ");
		rc.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		ap.refurbishmentBearingDesignationDropDown().click();
		cp.javaScriptExecutorType("1639605 C");
		rc.keyPress(KeyEvent.VK_ENTER);
		ap.addButton().click();
	}

	@AfterMethod
	public void tearDown() {
		Pages.driver.close();
		driver = null;
		log.debug("Browser closed");
	}

}
