package com.skf.testcases;

import static org.testng.Assert.assertTrue;

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

public class Project extends Pages {

	String path = System.getProperty("user.dir");
	public static Properties config = new Properties();
	public static FileInputStream fisco;

	@Test(enabled=false)
	public void projectNavigation() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp=new HomePage();
		ProjectPage pp=new ProjectPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		assertTrue(hp.projectHeader().isDisplayed());
		hp.projectHeader().click();
		Thread.sleep(5000);
		assertTrue(pp.addNewProjectCaseLink().isDisplayed());
		assertTrue(pp.projectNameTableHeader().isDisplayed());
		assertTrue(pp.projectDescriptionTableHeader().isDisplayed());
		assertTrue(pp.ETO_IDTableHeader().isDisplayed());
		assertTrue(pp.countryTableHeader().isDisplayed());
		assertTrue(pp.editIconTableIcon().isDisplayed());
		assertTrue(pp.deleteTableIcon().isDisplayed());	
	}

	@Test
	public void addNewProject() throws IOException, InterruptedException {
		fisco = new FileInputStream(path + "\\src\\test\\resources\\properties\\Config.properties");
		config.load(fisco);
		LoginPage loginPage = new LoginPage();
		HomePage hp=new HomePage();
		ProjectPage pp=new ProjectPage();
		AddNewProjectPage ap=new AddNewProjectPage();
		loginPage.loginApp(config.getProperty("validUsername"),
				config.getProperty("validPassword"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		assertTrue(hp.projectHeader().isDisplayed());
		hp.projectHeader().click();
		Thread.sleep(5000);
		assertTrue(pp.addNewProjectCaseLink().isDisplayed());
		pp.addNewProjectCaseLink().click();
		Thread.sleep(5000);
		assertTrue(ap.projectCaseNameLable().getText().matches("Project Case Name"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		Pages.driver.close();
		driver=null;
		log.debug("Browser closed");
	}

}
