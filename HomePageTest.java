package com.fly.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fly.PageObjects.HomePageObjects;
import com.fly.PageObjects.LaunchSetUp;

/*
 * This is home page tests that inherits from the launch setup and HomepageObjects
 * 
 */

public class HomePageTest extends LaunchSetUp {
	
	HomePageObjects homepage = new HomePageObjects();

	public HomePageTest() {
		// TODO Auto-generated constructor stub
	}


	@BeforeTest
	public void launchPageTest() {
		launchBrowser("firefox", "http://fly.com");
	}

	@Test
	public void getPageTitle() {
		System.out.println(driver.getTitle());
		homepage.typeFromLocation("San Francisco");
		homepage.typeToLocation("Atlanta");
		homepage.typeDepartureDate("03/16/2017");
		homepage.typeReturnDate("03/26/2017");
		homepage.clickSearchButton();
		System.out.println("This is the current URL = " + driver.getCurrentUrl());
	}

}
