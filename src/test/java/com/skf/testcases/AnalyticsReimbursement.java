
package com.skf.testcases;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Pages;
import com.skf.pages.AnalyticsPage;
import com.skf.pages.AnalyticsReimbursementPage;
import com.skf.pages.LandingPage;
import com.skf.pages.LoginPage;

public class AnalyticsReimbursement extends Pages {
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

	@Test
	public void verifyAnalticsReimbursementLabels() throws IOException, Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar = new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
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
		AnalyticsReimbursementPage ar = new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		ar.bearingByStatusGroupLabel().isDisplayed();
		Thread.sleep(10000);
		Actions action = new Actions(driver);
		action.moveByOffset(90, 223).doubleClick().perform();
		Thread.sleep(10000);
		action.moveByOffset(90, 98).click().perform();
	}

	@Test
	public void verifyFilterFocusMoreOptionIcon() throws IOException, Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar = new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		assertTrue(ar.bearingByStatusGroupLabel().isDisplayed());
		ar.refurishedBearingLabel().click();
		Thread.sleep(2000);
		assertTrue(ar.DrillDownIcon().isDisplayed());
		assertFalse(ar.DrillUpIcon().isEnabled());
		assertTrue(ar.GoToNextLevelIcon().isDisplayed());
		assertTrue(ar.FilterIcon().isEnabled());
		assertTrue(ar.FocusIcon().isEnabled());
		assertTrue(ar.MoreOptionIcon().isEnabled());
		ar.scrapRateGraphLabel().click();
		assertTrue(ar.DrillDownIcon().isDisplayed());
		assertFalse(ar.DrillUpIcon().isEnabled());
		assertTrue(ar.GoToNextLevelIcon().isDisplayed());
		assertTrue(ar.FilterIcon().isEnabled());
		assertTrue(ar.FocusIcon().isEnabled());
		assertTrue(ar.MoreOptionIcon().isEnabled());
		ar.detailedBatchLabel().click();
		assertTrue(ar.FilterIcon().isEnabled());
		assertTrue(ar.FocusIcon().isEnabled());
		assertTrue(ar.MoreOptionIcon().isEnabled());
		ar.scrapRatePercentLabel().click();
		assertTrue(ar.FilterIcon().isEnabled());
		assertTrue(ar.FocusIcon().isEnabled());
		assertTrue(ar.MoreOptionIcon().isEnabled());
	}

	@Test
	public void verifyDrillGoToNextExpandAllIconFunctionality() throws IOException, Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar = new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		assertTrue(ar.bearingByStatusGroupLabel().isDisplayed());
		ar.refurishedBearingLabel().click();
		Thread.sleep(2000);
		ar.GoToNextLevelIcon().click();
		Thread.sleep(2000);
		assertFalse(ar.ExpandDownOneAllHierarchyIcon().isEnabled());
	}

	@Test
	public void verifyExpandAllIconFunctionality() throws IOException, Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar = new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		assertTrue(ar.bearingByStatusGroupLabel().isDisplayed());
		ar.refurishedBearingLabel().click();
		Thread.sleep(2000);
		assertTrue(ar.ExpandDownOneAllHierarchyIcon().isEnabled());
		ar.ExpandDownOneAllHierarchyIcon().click();
		Thread.sleep(2000);
		assertFalse(ar.GoToNextLevelIcon().isEnabled());
	}

	@Test
	public void verifyFilterFunctionality() throws IOException, Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar = new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		assertTrue(ar.bearingByStatusGroupLabel().isDisplayed());
		ar.refurishedBearingLabel().click();
		Thread.sleep(2000);
		assertTrue(ar.FilterIcon().isEnabled());
		ar.FilterIcon().click();
		Thread.sleep(2000);
		assertTrue(ar.filterDateMonth().isDisplayed());
		assertTrue(ar.filterDateYear().isDisplayed());
		assertTrue(ar.filterStatusGroup().isDisplayed());
	}

	@Test
	public void verifyFocusModeFunctionality() throws IOException, Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar = new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		assertTrue(ar.bearingByStatusGroupLabel().isDisplayed());
		ar.refurishedBearingLabel().click();
		Thread.sleep(2000);
		assertTrue(ar.FocusIcon().isEnabled());
		ar.FocusIcon().click();
		Thread.sleep(5000);
		assertTrue(ar.backToReport().isDisplayed());
	}

	@Test
	public void verifyMoreOPtionFunctionality() throws IOException, Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar = new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		assertTrue(ar.bearingByStatusGroupLabel().isDisplayed());
		ar.refurishedBearingLabel().click();
		Thread.sleep(2000);
		assertTrue(ar.MoreOptionIcon().isEnabled());
		ar.MoreOptionIcon().click();
		Thread.sleep(2000);
		assertTrue(ar.exportData().isDisplayed());
		ar.exportData().click();
		assertFalse(ar.underlyingData().isEnabled());
		ar.fileFormatDropdown().click();
		assertTrue(ar.fileFormatXLSX().isDisplayed());
		assertTrue(ar.fileFormatCSV().isDisplayed());
		ar.exportButton().click();
		Thread.sleep(5000);
		assertTrue(ar.exportingDataMessage().isDisplayed());
	}

	@Test
	public void verifyCancelExportFunctionality() throws IOException, Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar = new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		assertTrue(ar.bearingByStatusGroupLabel().isDisplayed());
		ar.refurishedBearingLabel().click();
		Thread.sleep(2000);
		assertTrue(ar.MoreOptionIcon().isEnabled());
		ar.MoreOptionIcon().click();
		Thread.sleep(2000);
		assertTrue(ar.exportData().isDisplayed());
		ar.exportData().click();
		Thread.sleep(2000);
		ar.exportingDataCancelButton().click();
		Thread.sleep(2000);
		assertTrue(ar.bearingByStatusGroupLabel().isDisplayed());
	}

	@Test
	public void verifyShowAsTableFunctionality() throws IOException, Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar = new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		assertTrue(ar.bearingByStatusGroupLabel().isDisplayed());
		ar.refurishedBearingLabel().click();
		Thread.sleep(2000);
		assertTrue(ar.MoreOptionIcon().isEnabled());
		ar.MoreOptionIcon().click();
		Thread.sleep(2000);
		assertTrue(ar.showAsTableIcon().isDisplayed());
		ar.showAsTableIcon().click();
		Thread.sleep(2000);
		ar.switchToVerticalLayoutIcon().click();
		Thread.sleep(2000);
		ar.switchToVerticalLayoutIcon().click();
	}

    @Test
	public void verifyDetailedBatchTableAndDatePicker() throws IOException, Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar = new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		assertTrue(ar.bearingByStatusGroupLabel().isDisplayed());
		assertTrue(ar.DetailedBatchDateHeader().isDisplayed());
		assertTrue(ar.DetailedBatchBatchHeader().isDisplayed());
		assertTrue(ar.DetailedBatchDesignationHeader().isDisplayed());
		assertTrue(ar.DetailedBatchTBUHeader().isDisplayed());
		assertTrue(ar.DetailedBatchScrappedHeader().isDisplayed());
		assertTrue(ar.DetailedBatchBatchStatusHeader().isDisplayed());
		String dateBefore = ar.dateText().getAttribute("aria-label");
		Actions action = new Actions(driver);
		action.click(ar.leftDateSlider()).build().perform();
		Thread.sleep(1000);
		for (int i = 0; i < 10; i++) {
			action.sendKeys(Keys.ARROW_RIGHT).build().perform();
			Thread.sleep(200);
		}

		String dateAfter = ar.dateText().getAttribute("aria-label");
		assertTrue(dateBefore != dateAfter);
	}
	
	
	@Test
	public void verifyScrappageReasonByComponentLabelAndFunctionality() throws IOException, Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		AnalyticsReimbursementPage ar = new AnalyticsReimbursementPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		LandingPage landingPage = new LandingPage();
		Thread.sleep(15000);
		assertEquals("Dashboard", landingPage.dashboardLabel().getText());
		landingPage.analyticsLabel().click();
		landingPage.analyticsSales_Refurbishment_CoMolabel().isDisplayed();
		AnalyticsPage analyticspage = new AnalyticsPage();
		assertTrue(analyticspage.analyticsSalesLabel().isDisplayed());
		assertTrue(analyticspage.analyticsRefurbishmentLabel().isDisplayed());
		analyticspage.analyticsRefurbishmentLabel().click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		assertTrue(ar.scrappageBearingStatus().isDisplayed());
		assertTrue(ar.scrappageCAGE().isDisplayed());
		assertTrue(ar.scrappageINNER().isDisplayed());
		assertTrue(ar.scrappageOUTER().isDisplayed());
		assertTrue(ar.scrappageROLLERS().isDisplayed());
		assertTrue(ar.scrappageTotal().isDisplayed());
		ar.scrappageBearingStatus().click();
		ar.MoreOptionIcon().click();
		assertTrue(ar.exportData().isDisplayed());
		assertTrue(ar.showAsTableIcon().isDisplayed());
		assertTrue(ar.spotlight().isDisplayed());
		assertTrue(ar.sortAscending().isDisplayed());
		assertTrue(ar.sortDescending().isDisplayed());
		assertTrue(ar.sortBy().isDisplayed());
		ar.spotlight().click();
	}

	@AfterMethod
	public void tearDown() {
		Pages.driver.close();
		driver = null;
		log.debug("Browser closed");
	}
}