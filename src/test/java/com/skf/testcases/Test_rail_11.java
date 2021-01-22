package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Pages;
import com.skf.pages.LandingPage;
import com.skf.pages.LoginPage;

public class Test_rail_11 extends Pages{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
     @Test
     public void verifyRail11() throws Exception {
    	 fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
 		config.load(fisco);
 		LoginPage loginPage = new LoginPage();
 		loginPage.loginApp(config.getProperty("Test_rail_11_user"),
 		config.getProperty("Test_rail_11_pass"));
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
      }
       @AfterMethod
 	    public void tearDown() {
 		Pages.driver.close();
 		driver=null;
 		log.debug("Browser closed");
 	
 }  
}
