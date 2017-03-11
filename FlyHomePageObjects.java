package com.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * Page objects for http://fly.com home page
 */

public class HomePageObjects extends LunchPageSetup {

	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver oneway_btn(WebDriver driver) {
		driver.findElement(By.cssSelector("div#triptype-group > label:nth-child(4)")).click();
		return driver;
	}

	public WebDriver rountrip_btn(WebDriver driver) {
		driver.findElement(By.cssSelector("div#triptype-group > label.seperator.fly-coll-mi-6.fly-ellipsis.active")).click();
		return driver;
	}

	public WebDriver fill_fromfield(WebDriver driver, String from) {
		driver.findElement(By.cssSelector("input#from-field")).clear();
		driver.findElement(By.cssSelector("input#from-field")).sendKeys(from);
		return driver;
	}

	public WebDriver fill_tofield(WebDriver driver, String to) {
		driver.findElement(By.cssSelector("input#to-field")).sendKeys(to);
		return driver;
	}

	public WebDriver select_leave_date(WebDriver driver, String date) {
		driver.findElement(By.cssSelector("input#date-depart")).sendKeys(date);
		return driver;
	}

	public WebDriver select_return_date(WebDriver driver, String date) {
		driver.findElement(By.id("date-return")).sendKeys(date);
		return driver;
	}

	public void travelers(WebDriver driver) {
		driver.findElement(By.id("travelers"));
	}

	public WebDriver clickSearch(WebDriver driver) {
		driver.findElement(By.cssSelector("button#search-btn > strong")).click();
		return driver;
	}

	public WebDriver click_today_deals(WebDriver driver) {
		driver.findElement(By
				.cssSelector("div#pageHeader ul.fly-nostyle.fly-main-menu.fly-hide-sm.fly-pull-left > li:nth-child(2)"))
				.click();
		return driver;
	}

	public WebDriver click_fare_calendar(WebDriver driver) {
		driver.findElement(By.cssSelector(
				"div#pageHeader ul.fly-nostyle.fly-main-menu.fly-hide-sm.fly-pull-left > li:nth-child(3) > a")).click();
		return driver;
	}

	public WebDriver find_deals(WebDriver driver) {
		driver.findElement(By.cssSelector(
				"#pageHeader ul.fly-nostyle.fly-main-menu.fly-hide-sm.fly-pull-left > li:nth-child(4) > a")).click();
		return driver;
	}

	public WebDriver find_Hotels(WebDriver driver) {
		driver.findElement(By
				.cssSelector("div#pageHeader ul.fly-nostyle.fly-main-menu.fly-hide-sm.fly-pull-left > li:nth-child(5)"))
				.click();
		return driver;
	}

	public WebDriver click_car_rental(WebDriver driver) {
		driver.findElement(By
				.cssSelector("div#pageHeader ul.fly-nostyle.fly-main-menu.fly-hide-sm.fly-pull-left > li:nth-child(6)"))
				.click();
		return driver;
	}

	public WebDriver click_flight(WebDriver driver) {
		driver.findElement(By
				.cssSelector("div#pageHeader ul.fly-nostyle.fly-main-menu.fly-hide-sm.fly-pull-left > li:nth-child(1)"))
				.click();
		return driver;
	}

}
