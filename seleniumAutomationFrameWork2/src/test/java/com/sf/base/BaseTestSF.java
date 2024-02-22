package com.sf.base;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;
import com.sf.utilities.Constants;
import com.sf.utilities.ExtentReportsUtility;
import com.sf.utilities.PropertiesUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestSF {
	
	protected static WebDriver driver = null;
	protected ExtentReportsUtility extentReport=ExtentReportsUtility.getInstance();
	protected Logger BaseTestSFLog = LogManager.getLogger();
	
	@BeforeMethod
	public void beforeAnyMethod() throws InterruptedException {
		String url = PropertiesUtility.readDataFromPropertyFile(Constants.APPLICATION_PROPERTIES, "url");
		createDriver(url);
		Thread.sleep(5000);
		BaseTestSFLog.info("-------in before method------");
	}
	
	@AfterMethod
	public void afterAllMethods() {
		driver.close();
		BaseTestSFLog.info("-------in afterallmethods method------");
	}
	
	public void createDriver(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public void sendingText(WebElement textToSend, String UserText ) {
		textToSend.sendKeys(UserText);
		BaseTestSFLog.info("Text entered is " + UserText);
	}
	
	public void ClickBut(WebElement ele, String object) {
		ele.click();
		BaseTestSFLog.info("User clicked " + object);
	}
	
	public String gettingText(WebElement textToGet) {
		String newText = textToGet.getText();
		BaseTestSFLog.info("Text got from web element is " + newText);
		return newText;
	}
	
	public void clearTextBox(WebElement ele, String object) {
		ele.clear();
		System.out.println("Text Box cleared" + object);
	}
	
	public Alert switchToAlert() {
		return null;
		
	}
	
public void AcceptAlert(Alert alert) {

		

	}

	public String getAlertText(Alert alert, String objectname) {
		return null;
		

	}

	public void dismisAlert() {

		

	}
	// ******************************alert ends**************************************

	// ******************************Action class reusable methods**************************************
	

	public void mouseOverOnElement(WebElement ele, String objName) {
		
	}

	public void ContextClickOnElement(WebElement ele, String objName) {
		
	}

	// ******************************Action class reusable method ends**************************************

	// ******************************Select class reusable method starts*************************************

	public void selectByTextData(WebElement element, String text, String objName) {
		

	}

	public void selectByIndexData(WebElement element, int index, String objName) {
		

	}

	public void selectByValueData(WebElement element, String text, String objName) {
		
	}
	
	public WebElement selectFromListUsingText(List<WebElement> list, String text) {
		return null;
		

	}

	// ******************************select class reusable method ends**************************************

	// ******************************wait reusable method starts**************************************

	public void waitUntilPageLoads() {
		
	}
	public void waitForVisibility(WebElement ele, int time, int pollingtime, String objectName) {
		
	}

	public void WaitUntilPresenceOfElementLocatedBy(By locator, String objName) {
		

	}

	public void waitUntilElementToBeClickable(By locator, String objName) {
		
	}

	public void waitForVisibility(WebElement ele, int time, String objectName) {
		
	}

	public void waitForAlertPresent(int time) {
		
	}
	
	public void takescreenshot(String filepath) {
		 TakesScreenshot screenCapture=(TakesScreenshot)driver;
		 File src=screenCapture.getScreenshotAs(OutputType.FILE);
		 File destination=new File(filepath);
		 try {
			Files.copy(src, destination);
			BaseTestSFLog.info("captured the screen");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			BaseTestSFLog.info("went wrong when capturing the screen");
			
		}
	}
	
	public void takescreenshot(WebElement element,String filepath) {
		
	}

}
