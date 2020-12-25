package com.skf.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skf.base.Page;
import com.skf.pages.LoginPage;
import com.skf.pages.TurbinePage;
import com.skf.utilities.CommonUtilities;

public class Turbine extends Page {
	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

	@Test(enabled = false)
	public void turbine() throws IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.turbineDropdown().click();
		turbinePage.firstValueOfTurbineDropDown().click();
		turbinePage.filterLabel().click();
		turbinePage.mapTurbine().click();
		assertTrue(turbinePage.turbineNameOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.currentStatusOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.nextPlannedActionOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.indicatedFaultOnHeaderPopUp().isDisplayed());
		assertTrue(turbinePage.previousActionTakenOnHeaderPopUp().isDisplayed());
		turbinePage.reportFaultButtonOnHeaderPopUp().isDisplayed();
		turbinePage.reportFeedbackButtonOnHeaderPop().isDisplayed();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", turbinePage.closeButtonOnHeaderPop());
		turbinePage.user().click();
		turbinePage.signOut().click();
	}

	@Test(enabled = true)
	public void countryFilterFuntionality() throws InterruptedException, IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.countryDropdown().click();
		assertTrue(turbinePage.countrySelectAllDropDownValue().isDisplayed());
		turbinePage.countrySelectFirstValueBEL().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.countryTickMark().isEnabled());
		turbinePage.clearAllLink().click();
		turbinePage.countryDropdown().click();
		turbinePage.countrySelectAllDropDownValue().click();
		assertTrue(turbinePage.countryTickMark().isEnabled());
		turbinePage.clearAllLink().click();
		turbinePage.countryDropdown().click();
		turbinePage.countrySelectAllDropDownValue().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		turbinePage.countrySelectFirstValueBEL().click();
		assertTrue(turbinePage.countryTickMark().isEnabled());
	}

	@Test(enabled = true)
	public void countryFilterTypingFuntionality() throws InterruptedException, IOException, AWTException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		CommonUtilities utilities = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.countryDropdown().click();
		utilities.javaScriptExecutorType("BEL");
		assertTrue(turbinePage.countrySelectFirstValueBEL().isDisplayed());
		assertTrue(turbinePage.countrySelectFirstValueBEL().getText().contentEquals("BEL"));
		utilities.javaScriptExecutorType("InvalidInput");
		assertTrue(turbinePage.countryNoOptionDropdownValue().isDisplayed());
	}

	@Test(enabled = true)
	public void ownerFilterFuntionality() throws InterruptedException, IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.ownerDropdown().click();
		assertTrue(turbinePage.ownerSelectAllDropdownValue().isDisplayed());
		turbinePage.ownerSelectFirstValue().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.ownerTickMark().isEnabled());
		turbinePage.clearAllLink().click();
		turbinePage.ownerDropdown().click();
		turbinePage.ownerSelectAllDropdownValue().click();
		assertTrue(turbinePage.ownerTickMark().isEnabled());
		turbinePage.clearAllLink().click();
		turbinePage.ownerDropdown().click();
		assertTrue(turbinePage.ownerSelectAllDropdownValue().isDisplayed());
		turbinePage.ownerSelectFirstValue().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.ownerTickMark().isEnabled());
	}

	@Test(enabled = true)
	public void ownerFilterTypingFuntionality() throws InterruptedException, IOException, AWTException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		CommonUtilities utilities = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.ownerDropdown().click();
		utilities.javaScriptExecutorType("Boralex");
		assertTrue(turbinePage.ownerSelectFirstValue().isDisplayed());
		assertTrue(turbinePage.ownerSelectFirstValue().getText().contentEquals("Boralex"));
		utilities.javaScriptExecutorType("InvalidInput");
		assertTrue(turbinePage.countryNoOptionDropdownValue().isDisplayed());
	}

	@Test(enabled = true)
	public void turbineOverviewUI() throws IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.openEventLabelText().isDisplayed());
		assertTrue(turbinePage.workOrdersLabelText().isDisplayed());
		assertTrue(turbinePage.overdueLabelText().isDisplayed());
		assertTrue(turbinePage.filtersLabelText().isDisplayed());
		assertTrue(turbinePage.searchLabelText().isDisplayed());
		assertTrue(turbinePage.lastSubmitedEventReportsLabelText().isDisplayed());
		assertTrue(turbinePage.windFarmMapLabelText().isDisplayed());

	}

	@Test(enabled = true)
	public void regionalFilter1() throws IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.regionDropdownFilter().click();
		assertTrue(turbinePage.regionDropdownEUOption().getText().contentEquals("EU"));
		turbinePage.regionDropdownEUOption().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.regiontickMark().isEnabled());

	}

	@Test(enabled = true)
	public void regionalFilter2() throws IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.regionDropdownFilter().click();
		turbinePage.regionDropdownEUOption().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		turbinePage.clearAllLink().click();
		turbinePage.regionDropdownFilter().click();
		turbinePage.regionDropdownEUOption().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		turbinePage.regionDropdownFilter().click();
		turbinePage.regionDropdownEUOption().click();
	}

	@Test(enabled = true)
	public void regionalFilter3() throws InterruptedException, IOException, AWTException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		CommonUtilities utilities = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.regionDropdownFilter().click();
		utilities.javaScriptExecutorType("EU");
		assertTrue(turbinePage.regionDropdownEUOption().isDisplayed());
		turbinePage.regionDropdownEUOption().click();
		turbinePage.clearAllLink().click();
		turbinePage.regionDropdownFilter().click();
		utilities.javaScriptExecutorType("Asia");
		assertTrue(turbinePage.regionNoOptionDropdownValue().isDisplayed());
	}

	@Test(enabled = true)
	public void windFarmFilter1() throws IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.windFarmDropdownFilter().click();
		assertTrue(turbinePage.windFarmDropdownClerimoisOption().getText().contentEquals("Clerimois"));
		turbinePage.windFarmDropdownClerimoisOption().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.windFarmtickMark().isEnabled());
		turbinePage.windFarmSelectAllDropdownOption().click();
		assertTrue(turbinePage.windFarmSelectAllDropdownOption().isDisplayed());

	}

	@Test(enabled = true)
	public void windFarmFilter2() throws InterruptedException, IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.windFarmDropdownFilter().click();
		turbinePage.windFarmSelectFirstValueArtois().click();
		turbinePage.windFarmSelectFifthValueCalmont().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.windFarmtickMark().isEnabled());
		turbinePage.clearAllLink().click();
		turbinePage.windFarmDropdownFilter().click();
		turbinePage.windFarmSelectAllDropdownOption().click();
		assertTrue(turbinePage.windFarmtickMark().isEnabled());
		turbinePage.clearAllLink().click();
		turbinePage.windFarmDropdownFilter().click();
		turbinePage.windFarmSelectAllDropdownOption().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());

	}

	@Test (enabled = true)
	public void windFarmFilter3() throws InterruptedException, IOException, AWTException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		CommonUtilities utilities = new CommonUtilities();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.windFarmDropdownFilter().click();
		utilities.javaScriptExecutorType("Clerimois");
		assertTrue(turbinePage.windFarmDropdownClerimoisOption().isDisplayed());
		turbinePage.windFarmDropdownClerimoisOption().click();
		turbinePage.clearAllLink().click();
		turbinePage.windFarmDropdownFilter().click();
		utilities.javaScriptExecutorType("Incorrect");
		assertTrue(turbinePage.windFarmNoOptionDropdownValue().isDisplayed());
	}

	@Test(enabled = true)
	public void windFarmFilter4() throws InterruptedException, IOException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		turbinePage.windFarmDropdownFilter().click();
		turbinePage.windFarmSelectAllDropdownOption().click();
		assertTrue(turbinePage.clearAllLink().isDisplayed());
		assertTrue(turbinePage.windFarmtickMark().isEnabled());
		turbinePage.clearAllLink().click();
		turbinePage.windFarmDropdownFilter().click();
		assertTrue(turbinePage.windFarmSelectAllDropdownOption().isDisplayed());

	}

	@Test(enabled = true)
	public void searchWindFarm() throws InterruptedException, IOException, AWTException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		CommonUtilities utilities = new CommonUtilities();
		turbinePage.windFarmSearchDropdown().click();
		turbinePage.windFarmSearchSeeAllSearchResult().click();
		utilities.javaScriptExecutorType("WO B2 15550821");
		turbinePage.windFarmSearchRecord().click();
		assertTrue(turbinePage.windFarmSearchRecordOnMap().isDisplayed());
	}

	@Test(enabled = true)
	public void turbineoverview() throws Exception {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
		turbinePage.turbineDropdown().click();
		assertTrue(turbinePage.firstValueOfTurbineDropDown().getText().contentEquals("15355"));
		turbinePage.firstValueOfTurbineDropDown().click();
		assertTrue(turbinePage.clearall().isDisplayed());
		assertTrue(turbinePage.tick().isDisplayed());
		turbinePage.clearall().click();
		turbinePage.turbineDropdown().click();
		turbinePage.secondValueOfTurbineDropDown().click();
		turbinePage.thirdValueOfTurbineDropDown().click();
		assertTrue(turbinePage.clearall().isDisplayed());
		turbinePage.clearall().click();
		turbinePage.turbineDropdown().click();
		turbinePage.turbinedatafield().sendKeys("BEL");
		assertTrue(turbinePage.noptions().isDisplayed());
		turbinePage.eventworkorder().click();
		assertTrue(turbinePage.eventworkorderlabel().isDisplayed());
		turbinePage.skflink().click();
		assertTrue(turbinePage.turbineoverviewlabel().isDisplayed());
	}
	
	@Test (enabled = true)
	public void logout() throws IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.filterLabel().isDisplayed());
		turbinePage.user().click();
		assertTrue(turbinePage.userTab().isDisplayed());
		assertTrue(turbinePage.skfWindLabel().isDisplayed());
		assertTrue(turbinePage.signOut().isDisplayed());
		assertTrue(turbinePage.userName().isDisplayed());
		assertTrue(turbinePage.userEmailId().isDisplayed());
		turbinePage.signOut().click();
		assertEquals(driver.getCurrentUrl(),config.getProperty("loginPageUrl"));
	}
	
	@Test(enabled = true)
	public void lastSubmitedEventReports() throws IOException {

		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"), config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.lastSubmitedEventReportsLabelText().isDisplayed());
		turbinePage.turbineDropdown().click();
		assertTrue(turbinePage.firstValueOfTurbineDropDown().isDisplayed());
		turbinePage.firstValueOfTurbineDropDown().click();
		assertTrue(turbinePage.eventReportList().isDisplayed());
	}
	
	@Test (enabled = true)
	public void lastSubmitedEventReports2() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		TurbinePage turbinePage = new TurbinePage();
		assertTrue(turbinePage.lastSubmitedEventReportsLabelText().isDisplayed());
		Thread.sleep(3000);
		assertTrue(turbinePage.firstReportFromReportList().isDisplayed());
		turbinePage.firstReportFromReportList().click();
		assertTrue(turbinePage.reportPopUpHeader().isDisplayed());
		assertTrue(turbinePage.reportPopUpHeaderText().contains(turbinePage.firstReportText()));
		
	}

	@AfterMethod
	public void tearDown() {
		Page.driver.close();
		driver = null;
		log.debug("Browser closed");
	}
}