package com.sf.automationtests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sf.base.BaseTestSF;
import com.sf.utilities.Constants;
import com.sf.utilities.ExtentReportsUtility;
import com.sf.utilities.PropertiesUtility;

import java.util.List;

public class TestScriptLeads extends BaseTestSF {
	protected Logger TestScriptLoginLog = LogManager.getLogger();
	protected ExtentReportsUtility extentReport=ExtentReportsUtility.getInstance();

	@Test
	public void LeadsSFTC6() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC6------");
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
		
		WebElement LeadsTab = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		ClickBut(LeadsTab, "Leads Menu");
		
		WebElement LeadsTitle = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		gettingText(LeadsTitle);
		
		Thread.sleep(2000);
		TestScriptLoginLog.info("-------Completed TC6------");
		
	}
	@Test
	public void LeadsSFTC7() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC7------");
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
		
		WebElement LeadsTab = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		ClickBut(LeadsTab, "Leads Menu");
		
		WebElement LeadsTitle = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		gettingText(LeadsTitle);
		
		WebElement clickLeads = driver.findElement(By.id("fcf"));
		ClickBut(clickLeads, "Leads dropdown");
		
		String[] exp = {"All Open Leads", "My Unread Leads", "Recently Viewed Leads", "Today's Leads"};
		
		Select select = new Select(clickLeads);
		List <WebElement> options = select.getOptions();
		for(int i = 0; i< options.size() - 2; i++) {
			String str = options.get(i).getText();
			System.out.println("Text found in the dropdown is " + str);
			
			if(str.equals(exp[i])) {
				System.out.println("got text is equal to expected text");
			}
		}
	
		Thread.sleep(2000);
		TestScriptLoginLog.info("-------Completed TC7------");
	}
	@Test
	public void LeadsSFTC8() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC8------");
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
		
		WebElement LeadsTab = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		ClickBut(LeadsTab, "Leads Menu");
		
		Thread.sleep(2000);
		
		WebElement clickLeads = driver.findElement(By.id("fcf"));
		//ClickBut(clickLeads, "Leads dropdown");
		
		Select select = new Select(clickLeads);
		//select.deselectAll();
		select.selectByVisibleText("My Unread Leads");
		ClickBut(clickLeads, "Leads dropdown");
		
		WebElement goBut = driver.findElement(By.name("go"));
		ClickBut(goBut, "Go Button");
		
		Thread.sleep(2000);
		
		WebElement userDropdown = driver.findElement(By.id("userNav-arrow"));
		ClickBut(userDropdown, "user navigation dropdown");
		
		Thread.sleep(2000);
		
		WebElement Logout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		ClickBut(Logout, "Logout button");
		
		Thread.sleep(2000);
		
		WebElement userTextBox2 = driver.findElement(By.id("username"));
		sendingText(userTextBox2,userName);
		
		WebElement passwdTextBox2 = driver.findElement(By.id("password"));
		sendingText(passwdTextBox2,passWord);
		
		Thread.sleep(2000);
		
		WebElement loginBut2 = driver.findElement(By.id("Login"));
		ClickBut(loginBut2, " Login Button");
		
		Thread.sleep(2000);
		
		WebElement LeadsTab2 = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		ClickBut(LeadsTab2, "Leads Menu");
		
		WebElement goBut2 = driver.findElement(By.name("go"));
		ClickBut(goBut2, "Go Button 2");
		
		Thread.sleep(2000);
		TestScriptLoginLog.info("-------Completed TC8------");
	}
	@Test
	public void LeadsSFTC9() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC9------");
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
		
		WebElement LeadsTab = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		ClickBut(LeadsTab, "Leads Menu");
		
		Thread.sleep(2000);
		
		WebElement clickLeads = driver.findElement(By.id("fcf"));
		//ClickBut(clickLeads, "Leads dropdown");
		
		Select select = new Select(clickLeads);
		//select.deselectAll();
		select.selectByVisibleText("Today's Leads");
		ClickBut(clickLeads, "Leads dropdown");
		
		WebElement goBut = driver.findElement(By.name("go"));
		ClickBut(goBut, "Go Button");
		
		Thread.sleep(2000);
		TestScriptLoginLog.info("-------Completed TC9------");	
	}
	@Test
	public void LeadsSFTC10() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC10------");
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
		
		WebElement LeadsTab = driver.findElement(By.xpath("//*[@id=\"Lead_Tab\"]/a"));
		ClickBut(LeadsTab, "Leads Menu");
		
		WebElement newBut = driver.findElement(By.name("new"));
		ClickBut(newBut, "New Button");
		
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.id("name_lastlea2"));
		sendingText(lastName,"ABCD");
		
		WebElement companyName = driver.findElement(By.id("lea3"));
		sendingText(companyName,"ABCD");
		
		WebElement saveBut = driver.findElement(By.name("save"));
		ClickBut(saveBut, "Save Button");
		
		Thread.sleep(2000);
		
		WebElement newPage = driver.findElement(By.className("topName"));
		gettingText(newPage);
		
		Thread.sleep(2000);
		TestScriptLoginLog.info("-------Completed TC10------");
	}
	
	
}

	

