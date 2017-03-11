package com.fly.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/*
 * This is the launch setup page with launching browser functions
 * 
 */

public class LaunchSetUp {

	public WebDriver driver;

	public LaunchSetUp() {
		// TODO Auto-generated constructor stub
	}
	
	public WebDriver driver(WebDriver driver) {
		return driver = this.driver;
	}
	
	public void launchBrowser(String browser, String browserURL){
		if (browser == "firefox"){
		System.setProperty("webdriver.gecko.driver", "/Users/Femi/documents/qa_training/geckodriver" );
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(browserURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		} else if(browser == "chrome"){
			System.setProperty("webdriver.chrome.driver", "/Users/Femi/documents/qa_training/chromedriver" );
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(browserURL);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
	
	@AfterTest
	public void teatDown(){
		driver.quit();
		System.out.println("Browser has been successfully closed");
	}


}
