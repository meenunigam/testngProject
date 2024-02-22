package com.sf.automationtests;

import java.util.List;

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

import java.util.Arrays;

public class TestScriptUserMenuDD extends BaseTestSF{
	
	protected Logger TestScriptLoginLog = LogManager.getLogger();
	protected ExtentReportsUtility extentReport=ExtentReportsUtility.getInstance();
	
	@Test
	public void userMenuSFTC16() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC16------");
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
		
		Thread.sleep(2000);
		
		WebElement homePage = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		gettingText(homePage);
		
		WebElement userMenu = driver.findElement(By.id("userNavButton"));
		ClickBut(userMenu, "User Menu");
		
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='userNav-menuItems']//a"));
		
		String[] exp = {"My Profile", "My Settings" ,"Developer Console","Switch to Lightning Experience","Logout"};
		
		for(int i = 0; i< li.size(); i++) {
			String str = li.get(i).getText();
			System.out.println("Text found in the dropdown is " + str);
			
			if(str.equals(exp[i])) {
				System.out.println("got text is equal to expected text");
			}
			
		}
		
		Thread.sleep(2000);
		TestScriptLoginLog.info("-------Completed TC16------");
	}
	
	@Test
	public void userMenuSFTC17() throws InterruptedException {
		
		TestScriptLoginLog.info("-------Starting TC17------");
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
		
		Thread.sleep(2000);
		
		WebElement homePage = driver.findElement(By.xpath("//*[@id=\"home_Tab\"]/a"));
		gettingText(homePage);
		
		WebElement userMenu = driver.findElement(By.id("userNavButton"));
		ClickBut(userMenu, "User Menu");
		
		WebElement myProfile = driver.findElement(By.xpath("//a[@title='My Profile']"));
		ClickBut(myProfile, "MyProfile Menu item");
		
		WebElement editProfile = driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
		ClickBut(editProfile, "EditProfile button");
		
		Thread.sleep(4000);
		
		WebElement aboutTab = driver.findElement(By.id("aboutTab"));
		ClickBut(aboutTab, "about tab");
		
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		clearTextBox(lastName, "last name field");
		sendingText(lastName, "Singh");
		
		Thread.sleep(2000);
		TestScriptLoginLog.info("-------Completed TC17------");
	}
}
