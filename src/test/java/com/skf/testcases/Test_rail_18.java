package com.skf.testcases;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Pages;
import com.skf.pages.LandingPage;
import com.skf.pages.LoginPage;

public class Test_rail_18 extends Pages{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
  @Test
  public void verifyRail18() throws Exception  {
	  fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
	    config.load(fisco);
	    LoginPage loginPage = new LoginPage();
	    loginPage.loginApp(config.getProperty("Test_rail_18_user"),
	    config.getProperty("Test_rail_18_pass"));
	    LandingPage landingPage = new LandingPage();
	    Thread.sleep(15000);
	    landingPage.supplyChainTilesLabel().isDisplayed();
	    landingPage.supplyChainLabel().click();
	    assertEquals(landingPage.supplyChainLabel().getText(),"Supply Chain");
  }
            @AfterMethod
		    public void tearDown() {
			Pages.driver.close();
			driver=null;
			log.debug("Browser closed");
		}
}
