package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Pages;
import com.skf.pages.AnalyticsPage;
import com.skf.pages.AnalyticsReimbursementPage;
import com.skf.pages.LandingPage;
import com.skf.pages.LoginPage;
import com.skf.utilities.CommonUtilities;

public class AnalyticsReimbursement extends Pages{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
  //@Test
  public void verifyAnalticsReimbursementLabels() throws IOException, Exception {
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar=new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"),
		config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		assertTrue(ar.bearingByStatusGroupLabel().isDisplayed());
		assertTrue(ar.bearingByReimbursementUnitLabel().isDisplayed());
		assertTrue(ar.bearingByCustomerLabel().isDisplayed());
		assertTrue(ar.bearingByDesignationLabel().isDisplayed());
		assertTrue(ar.customerLabel().isDisplayed());
		assertTrue(ar.batchesLabel().isDisplayed());
		assertTrue(ar.designationLabel().isDisplayed());
		assertTrue(ar.bearingLabel().isDisplayed());
		assertTrue(ar.scrappedLabel().isDisplayed());
		assertTrue(ar.refurishedBearingLabel().isDisplayed());
		assertTrue(ar.scrapRateGraphLabel().isDisplayed());
		assertTrue(ar.scrapRatePercentLabel().isDisplayed());
		assertTrue(ar.scrapBearingByComponentLabel().isDisplayed());				
  }
  
  @Test
  public void verifySearchAndClearFunctionality() throws IOException, Exception {
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar=new AnalyticsReimbursementPage();
		CommonUtilities cm=new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"),
		config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(10000);
		driver.switchTo().frame(0);
		assertTrue(ar.bearingByStatusGroupLabel().isDisplayed());
		assertTrue(ar.bearingByStatusGroupValue().isDisplayed());
		driver.switchTo().defaultContent();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("size is"+size);
		cm.javaScriptClick(ar.bearingByStatusGroupValue());
		//ar.bearingByStatusGroupValue().click();
		Actions action=new Actions(driver);
		action.moveByOffset(240, 350);
		Thread.sleep(10000);
		
				
  }
  
  
  //@AfterMethod
	public void tearDown() {
		Pages.driver.close();
		driver=null;
		log.debug("Browser closed");
	}
}
