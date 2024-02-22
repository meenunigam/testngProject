package com.sf.automationtests;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sf.base.BaseTestSF;
import com.sf.utilities.Constants;
import com.sf.utilities.ExtentReportsUtility;
import com.sf.utilities.PropertiesUtility;

public class TestScriptLogin extends BaseTestSF {
	
	protected Logger TestScriptLoginLog = LogManager.getLogger();
	protected ExtentReportsUtility extentReport=ExtentReportsUtility.getInstance();

	
	@Test
	public void loginSFTC1() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC1------");
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		
		WebElement userTextBox = driver.findElement(By.id("username"));
		sendingText(userTextBox,userName);
		
		WebElement loginBut = driver.findElement(By.id("Login"));
		ClickBut(loginBut, "Login Button");
		
		WebElement error = driver.findElement(By.id("error"));
		gettingText(error);
		
		System.out.println(error.getText());
		
		Thread.sleep(5000);
		TestScriptLoginLog.info("-------completed TC1------");
	}
	
	@Test
	public void loginSFTC2() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC2------");
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		String passWord = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		WebElement userTextBox = driver.findElement(By.id("username"));
		sendingText(userTextBox,userName);
		
		WebElement passwdTextBox = driver.findElement(By.id("password"));
		sendingText(passwdTextBox,passWord);
		
		WebElement loginBut = driver.findElement(By.id("Login"));
		ClickBut(loginBut, "Login Button");
		
		Thread.sleep(5000);
		
		WebElement homePage = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		gettingText(homePage);
		
		Thread.sleep(5000);
		TestScriptLoginLog.info("-------completed TC2------");
	}
	@Test
	public void loginSFTC3() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC3------");
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		String passWord = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
	
		WebElement userTextBox = driver.findElement(By.id("username"));
		sendingText(userTextBox,userName);
		
		WebElement passwdTextBox = driver.findElement(By.id("password"));
		sendingText(passwdTextBox,passWord);
		WebElement rememberBut = driver.findElement(By.id("rememberUn"));
		ClickBut(rememberBut, "Remember Check Box");
		
		WebElement loginBut = driver.findElement(By.id("Login"));
		ClickBut(loginBut, " Login Button");
		
		WebElement homePage = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		gettingText(homePage);
		
		WebElement userMenu = driver.findElement(By.id("userNavButton"));
		ClickBut(userMenu, "User Menu");
		
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		ClickBut(logout, "Logout Button");
		
		Thread.sleep(2000);
		
		WebElement userNameBox = driver.findElement(By.id("idcard-identity"));
		gettingText(userNameBox);
		
		Thread.sleep(5000);
		TestScriptLoginLog.info("-------completed TC3------");
		
	}

	@Test
	public void loginSFTC4() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC4------");
		String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		String passWord = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		
		WebElement userTextBox = driver.findElement(By.id("username"));
		sendingText(userTextBox,userName);
		
		WebElement forgotpass = driver.findElement(By.id("forgot_password_link"));
		ClickBut(forgotpass, "forgot password");
		
		Thread.sleep(2000);
		WebElement enterEmail = driver.findElement(By.id("un"));
		sendingText(enterEmail, "");
		
		WebElement continueBut = driver.findElement(By.id("continue"));
		ClickBut(continueBut, "continue button");
		
		Thread.sleep(5000);
		TestScriptLoginLog.info("-------completed TC4------");
		
	}
	@Test
	public void loginSFTC5() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC5------");
		//String userName = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "username");
		//String passWord = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "password");
		
		WebElement userTextBox = driver.findElement(By.id("username"));
		sendingText(userTextBox,"123");
		
		WebElement passwdTextBox = driver.findElement(By.id("password"));
		sendingText(passwdTextBox,"22131");
		
		WebElement loginBut = driver.findElement(By.id("Login"));
		ClickBut(loginBut, "Login Button");
		
		Thread.sleep(2000);
		
		WebElement error = driver.findElement(By.id("error"));
		gettingText(error);
		
		Thread.sleep(5000);
		TestScriptLoginLog.info("-------completed TC5------");
	}
}
