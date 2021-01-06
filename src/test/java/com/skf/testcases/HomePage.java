package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Pages;
import com.skf.pages.LandingPage;
import com.skf.pages.LoginPage;
import com.skf.utilities.CommonUtilities;

public class HomePage extends Pages{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

  @Test
  public void verifyLandingPage() throws IOException, InterruptedException, AWTException {
	  
	    fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
		config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Rail Digital Transformation",landingPage.railDigitalTransformationLabel().getText());
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		assertEquals("Analytics", landingPage.analyticsLabel().getText());
		assertEquals("Supply Chain",landingPage.supplyChainLabel().getText());
		assertEquals("Projects",landingPage.projectsLabel().getText());
		assertTrue(landingPage.userRole().isDisplayed());
		assertEquals("Welcome to SKF Rail Digital Transformation",landingPage.welcomeNote().getText());
		assertEquals("Search for project case, product designation or customer", landingPage.searchBoxPlaceholder().getText());
		assertEquals("Dashboard",landingPage.dashboardTilesLabel().getText());
		assertEquals("Sales",landingPage.salesTilesLable().getText());
		assertEquals("Refurbishment",landingPage.refurbishmentTilesLabel().getText());
		assertEquals("CoMo",landingPage.coMoTilesLabel().getText());
		assertEquals("Supply Chain",landingPage.supplyChainTilesLabel().getText());
		landingPage.dashboardTilesImage().isDisplayed();
		landingPage.salesTilesImage().isDisplayed();
		landingPage.refurbishmentTilesImage().isDisplayed();
		landingPage.coMoTilesImage().isDisplayed();
		landingPage.supplyChainTilesImage().isDisplayed();
		landingPage.dashboardLabel().click();
		Thread.sleep(5000);
		assertTrue(landingPage.projectDropDown().isDisplayed());
		landingPage.analyticsLabel().click();
		Thread.sleep(5000);
		assertTrue(landingPage.projectDropDown().isDisplayed());
		landingPage.supplyChainLabel().click();
		Thread.sleep(5000);
		assertTrue(landingPage.projectDropDown().isDisplayed());
		landingPage.projectsLabel().click();
		Thread.sleep(5000);
		assertTrue(landingPage.projectCasesLabel().isDisplayed());
		landingPage.skfLink().click();
		Thread.sleep(8000);
		assertTrue(landingPage.welcomeNote().isDisplayed());
		landingPage.searchBox().click();
		//assertTrue(landingPage.searchBoxFirstValue().isDisplayed());
		assertTrue(landingPage.seeAllSearchResultLink().isDisplayed());
        landingPage.seeAllSearchResultLink().click();
        CommonUtilities utilities = new CommonUtilities();
        landingPage.searchBox().click();
        landingPage.searchBox().click();
        utilities.javaScriptExecutorType("Test");
        landingPage.searchBox().click();
        landingPage.searchBox().click();
        utilities.javaScriptExecutorType("Testhsjhjhsfjhs");
        landingPage.noOptions().isDisplayed();
        landingPage.dashboardTilesLabel().click();
        assertEquals("Dashboard",landingPage.supplyChain_Dashboard_ProjectsLabel().getText());
        landingPage.skfLink().click();
        landingPage.salesTilesLable().click();
        assertEquals("Sales",landingPage.analyticsSales_Refurbishment_CoMolabel().getText());
        landingPage.skfLink().click();
        landingPage.refurbishmentTilesLabel().click();
        assertEquals("Refurbishment",landingPage.analyticsSales_Refurbishment_CoMolabel().getText());
        landingPage.skfLink().click();
        landingPage.coMoTilesLabel().click();
        assertEquals("CoMo",landingPage.analyticsSales_Refurbishment_CoMolabel().getText());
        landingPage.skfLink().click();
        landingPage.supplyChainTilesLabel().click();
        assertEquals("Supply Chain",landingPage.supplyChain_Dashboard_ProjectsLabel().getText());
        landingPage.skfLink().click();
        landingPage.userRole().click();
        landingPage.skfRailLabel().isDisplayed();
        landingPage.logOutButton().isDisplayed();
        landingPage.userRoleLabel().isDisplayed();
        landingPage.userRoleEmailId().isDisplayed();
        landingPage.logOutButton().click();
        }
  @AfterMethod
	public void tearDown() {
		Pages.driver.close();
		driver=null;
		log.debug("Browser closed");
	}
}
