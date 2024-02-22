package com.sf.automationtests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sf.base.BaseTestSF;
import com.sf.utilities.Constants;
import com.sf.utilities.ExtentReportsUtility;
import com.sf.utilities.PropertiesUtility;

public class TestScriptOpty extends BaseTestSF{
	protected Logger TestScriptLoginLog = LogManager.getLogger();
	protected ExtentReportsUtility extentReport=ExtentReportsUtility.getInstance();
	@Test
	public void OptySFTC11() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC11------");
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		String passWord = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		
		WebElement userTextBox = driver.findElement(By.id("username"));
		sendingText(userTextBox,userName);
		
		WebElement passwdTextBox = driver.findElement(By.id("password"));
		sendingText(passwdTextBox,passWord);
		
		WebElement loginBut = driver.findElement(By.id("Login"));
		ClickBut(loginBut, " Login Button");
		
		WebElement homePage = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		gettingText(homePage);
		
		Thread.sleep(2000);
		
		WebElement opportTab = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		ClickBut(opportTab, "Opportunity Menu");
		
		Thread.sleep(2000);
		
		WebElement dropdnbut = driver.findElement(By.id("fcf"));
		ClickBut(dropdnbut, "drop down button clicked");
		Thread.sleep(5000);
		TestScriptLoginLog.info("-------completed TC11------");
	}
	@Test
	public void OptySFTC12() throws InterruptedException {
		TestScriptLoginLog.info("-------Starting TC12------");
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		String passWord = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		
		WebElement userTextBox = driver.findElement(By.id("username"));
		sendingText(userTextBox,userName);
		
		WebElement passwdTextBox = driver.findElement(By.id("password"));
		sendingText(passwdTextBox,passWord);
		
		WebElement loginBut = driver.findElement(By.id("Login"));
		ClickBut(loginBut, " Login Button");
		
		WebElement homePage = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		gettingText(homePage);
		
		Thread.sleep(2000);
		
		WebElement opportTab = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		ClickBut(opportTab, "Opportunity Menu");
		
		Thread.sleep(2000);
		
		WebElement newBut = driver.findElement(By.name("new"));
		ClickBut(newBut, "new button clicked");
		
		Thread.sleep(2000);
		
		WebElement opportName = driver.findElement(By.id("opp3"));
		sendingText(opportName,"opportunity name one");
		
		WebElement closeDate = driver.findElement(By.id("opp9"));
		sendingText(closeDate,"2/4/2024");
		
		WebElement stageDropDn = driver.findElement(By.id("opp11"));
		Select select = new Select(stageDropDn);
		select.selectByVisibleText("Qualification");
	
		WebElement saveBut = driver.findElement(By.name("save"));
		ClickBut(saveBut, "save button clicked");
		
		Thread.sleep(2000);
		
		WebElement newOpportunity = driver.findElement(By.id("opp3_ileinner"));
		gettingText(newOpportunity);
		
		if(newOpportunity.getText().equals("opportunity name one")) {
			System.out.println("New Opportunity successfully created");
		}
		
		Thread.sleep(2000);
		TestScriptLoginLog.info("-------completed TC12------");
	}
	@Test
	public void OptySFTC13() throws InterruptedException {
		TestScriptLoginLog.info("-------Starting TC13------");
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		String passWord = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		
		WebElement userTextBox = driver.findElement(By.id("username"));
		sendingText(userTextBox,userName);
		
		WebElement passwdTextBox = driver.findElement(By.id("password"));
		sendingText(passwdTextBox,passWord);
		
		WebElement loginBut = driver.findElement(By.id("Login"));
		ClickBut(loginBut, " Login Button");
		
		WebElement homePage = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		gettingText(homePage);
		
		Thread.sleep(2000);
		
		WebElement opportTab = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		ClickBut(opportTab, "Opportunity Menu");
		
		Thread.sleep(2000);
		
		WebElement opportPipeLink = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a"));
		ClickBut(opportPipeLink, "Opportunity Pipeline clicked");
		
		Thread.sleep(2000);
		
		WebElement opportPipePage = driver.findElement(By.xpath("//*[@id=\"noTableContainer\"]/div/div[1]/div[1]/div[1]/h1"));
		gettingText(opportPipePage);
		
		if(opportPipePage.getText().equals("Opportunity Pipeline")) {
			System.out.println("Successfully clicked opportunity pipeline");
		}
		
		Thread.sleep(2000);
		TestScriptLoginLog.info("-------completed TC13------");
	}
	@Test
	public void OptySFTC14() throws InterruptedException {
		TestScriptLoginLog.info("-------Starting TC14------");
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		String passWord = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		
		WebElement userTextBox = driver.findElement(By.id("username"));
		sendingText(userTextBox,userName);
		
		WebElement passwdTextBox = driver.findElement(By.id("password"));
		sendingText(passwdTextBox,passWord);
		
		WebElement loginBut = driver.findElement(By.id("Login"));
		ClickBut(loginBut, " Login Button");
		
		WebElement homePage = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		gettingText(homePage);
		
		Thread.sleep(2000);
		
		WebElement opportTab = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		ClickBut(opportTab, "Opportunity Menu");
		
		Thread.sleep(2000);
		
		WebElement opportStuck = driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
		ClickBut(opportStuck, "Stuck Opportunity clicked");
		
		Thread.sleep(2000);
		
		WebElement opportStuckPage = driver.findElement(By.xpath("//*[@id=\"noTableContainer\"]/div/div[1]/div[1]/div[1]/h1"));
		gettingText(opportStuckPage);
		
		if(opportStuckPage.getText().equals("Stuck Opportunities")) {
			System.out.println("Successfully clicked stuck opportunities");
		}
		
		Thread.sleep(2000);
		TestScriptLoginLog.info("-------completed TC14------");
	}
	@Test
	public void OptySFTC15() throws InterruptedException {
		TestScriptLoginLog.info("-------Starting TC15------");
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		String passWord = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		
		WebElement userTextBox = driver.findElement(By.id("username"));
		sendingText(userTextBox,userName);
		
		WebElement passwdTextBox = driver.findElement(By.id("password"));
		sendingText(passwdTextBox,passWord);
		
		WebElement loginBut = driver.findElement(By.id("Login"));
		ClickBut(loginBut, " Login Button");
		
		WebElement homePage = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		gettingText(homePage);
		
		Thread.sleep(2000);
		
		WebElement opportTab = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		ClickBut(opportTab, "Opportunity Menu");
		
		Thread.sleep(2000);
		
		WebElement intervalDropDn = driver.findElement(By.id("quarter_q"));
		Select select = new Select(intervalDropDn);
		select.selectByVisibleText("Current and Next FQ");
		
		WebElement includeDropDn = driver.findElement(By.id("open"));
		Select selectOne = new Select(includeDropDn);
		selectOne.selectByVisibleText("Open Opportunities");
		
		WebElement runReportBut = driver.findElement(By.xpath("//*[@id=\"lead_summary\"]/table/tbody/tr[3]/td/input"));
		ClickBut(runReportBut, "Run Report Button clicked");
		
		Thread.sleep(2000);
		
		WebElement opportReportPage = driver.findElement(By.xpath("//*[@id=\"noTableContainer\"]/div/div[1]/div[1]/div[1]/h1"));
		gettingText(opportReportPage);
		
		if(opportReportPage.getText().equals("Opportunity Report")) {
			System.out.println("Successfully clicked run Reports");
		}
		
		Thread.sleep(2000);
		TestScriptLoginLog.info("-------completed TC15------");
		
	}

}
