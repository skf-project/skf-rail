package com.skf.testcases;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Pages;
import com.skf.pages.AnalyticsPage;
import com.skf.pages.LandingPage;
import com.skf.pages.LoginPage;

public class Test_rail_26 extends Pages{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
  @Test
  public void verifyRail26() throws Exception {
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
	    config.load(fisco);
	    LoginPage loginPage = new LoginPage();
	    loginPage.loginApp(config.getProperty("Test_rail_26_user"),
	    config.getProperty("Test_rail_26_pass"));
	    LandingPage landingPage = new LandingPage();
	    AnalyticsPage analyticspage = new AnalyticsPage();
	    Thread.sleep(15000);
	    landingPage.supplyChainTilesLabel().isDisplayed();
	    landingPage.coMoTilesLabel().isDisplayed();
	    landingPage.supplyChainLabel().click();
	    Thread.sleep(5000);
	    landingPage.projectDropDown().isDisplayed();
	    landingPage.analyticsLabel().click();
	    assertEquals(analyticspage.analyticsCoMoLabel().getText(),"CoMo");
	    assertEquals(landingPage.analyticsSales_Refurbishment_CoMolabel().getText(),"CoMo");
	   
}
@AfterMethod
public void tearDown() {
	Pages.driver.close();
	driver=null;
	log.debug("Browser closed");
}
}
