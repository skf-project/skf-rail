package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.skf.base.Pages;
import com.skf.pages.LandingPage;
import com.skf.pages.LoginPage;
import com.skf.pages.SupplyChainPage;

public class SupplyChain extends Pages{
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;
  
	    @Test
        public void supplyChainVerify() throws IOException, Throwable {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
		config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.supplyChainLabel().click();
		assertTrue(landingPage.supplyChainLabel().isDisplayed());
		Thread.sleep(20000);
		landingPage.projectDropDown().isDisplayed();
		Robot robot = new Robot();
		landingPage.projectDropDown().click();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		SupplyChainPage supplyChainPage = new SupplyChainPage();
		assertTrue(supplyChainPage.selectedProjectNameLabel().isDisplayed());
		assertTrue(supplyChainPage.iFrame().isDisplayed());
		driver.switchTo().frame(supplyChainPage.iFrame());
		assertTrue(supplyChainPage.bearingDesignationLabel().isDisplayed());
		assertTrue(supplyChainPage.bearingDesignationDropDown().isDisplayed());
		assertEquals(supplyChainPage.bearingDesignationDropDown().getText(),"All");
		assertTrue(supplyChainPage.customerNameLabel().isDisplayed());
		assertTrue(supplyChainPage.customerNameDropDown().isDisplayed());
		assertEquals(supplyChainPage.customerNameDropDown().getText(),"All");
		assertTrue(supplyChainPage.comoCompanyNameLabel().isDisplayed());
		assertTrue(supplyChainPage.comoCompanyNameDropDown().isDisplayed());
		assertEquals(supplyChainPage.comoCompanyNameDropDown().getText(),"All");
		assertTrue(supplyChainPage.availabilityStatusLabel().isDisplayed());
		assertTrue(supplyChainPage.warehouseAvailabilitybyBearingDesignation().isDisplayed());
		assertTrue(supplyChainPage.warehouseAvailabilitybyBearingstobReplaced().isDisplayed());
		assertTrue(supplyChainPage.availabilitybyWarehouse().isDisplayed());
		assertTrue(supplyChainPage.eventsbyCompanyBearingDesignation().isDisplayed());
		driver.switchTo().frame(supplyChainPage.availabilityStatuiFrame());
		assertTrue(supplyChainPage.availabilityStatusButton1().isDisplayed());
		assertTrue(supplyChainPage.availabilityStatusButton2().isDisplayed());
		assertTrue(supplyChainPage.availabilityStatusButton3().isDisplayed());
		assertTrue(supplyChainPage.availabilityStatusButton4().isDisplayed());
		assertTrue(supplyChainPage.availabilityStatusButton5().isDisplayed());
		assertTrue(supplyChainPage.availabilityStatusButton6().isDisplayed());
    }
}
