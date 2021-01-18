package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Pages;
import com.skf.pages.AnalyticsPage;
import com.skf.pages.LandingPage;
import com.skf.pages.LoginPage;

public class Analytics_Sale extends Pages{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
	
  @Test
  public void verifyAnalticsSale() throws IOException, Exception {
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
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
		assertTrue(analyticspage.analyticsCoMoLabel().isDisplayed());
		Thread.sleep(20000);
		assertTrue(landingPage.projectDropDown().isDisplayed());
		Robot robot = new Robot();
		landingPage.projectDropDown().click();
		robot.keyPress(KeyEvent.VK_ENTER);
		//analyticspage.projectTickIcon().isDisplayed();
		
		
  }
  @Test
  public void verifyAnalticsSaleData() throws IOException, Exception
  {
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
		config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		Thread.sleep(15000);
		assertTrue(analyticspage.iFrame().isDisplayed());
		driver.switchTo().frame(analyticspage.iFrame());
		assertTrue(analyticspage.grossValueByStatusGroupTitle().isDisplayed());
		assertEquals(analyticspage.grossValueByStatusGroupTitle().getText(),"Gross Value by Status Group");
		assertEquals(analyticspage.grossValueBySaleUnitTitle().getText(),"Gross Value by Sales Unit");
		assertEquals(analyticspage.grossValueByCustomerTitle().getText(),"Gross Value by Customer");
		assertEquals(analyticspage.grossValueByDesignationTitle().getText(),"Gross Value by Designation");
		assertTrue(analyticspage.selectAllButton().isDisplayed());
		assertTrue(analyticspage.insightRailButton().isDisplayed());
		assertTrue(analyticspage.othersButton().isDisplayed());
		assertTrue(analyticspage.refurbishmentButton().isDisplayed());;
		assertTrue(analyticspage.remoteDiagnosticServicesButton().isDisplayed());
		assertTrue(analyticspage.tBUCTBUButton().isDisplayed());
  }
  @AfterMethod
	public void tearDown() {
		Pages.driver.close();
		driver=null;
		log.debug("Browser closed");
	}
}
