package com.Test_pages;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.page_object.HomePageObjects;
import com.page_object.LunchPageSetup;

/*
 * To test fly.com home page features
 */

public class HomepageTest extends LunchPageSetup {

	HomePageObjects Homepage = new HomePageObjects(driver);

	public HomepageTest() {
	}

	@BeforeTest
	public void location() {
		SetupBrowser("firefox", "http://fly.com");
	}

	@Test
	public void PageTitle() {
		System.out.println(driver.getTitle());
	}

	@Test
	public void onewaySearch() throws InterruptedException {
		Thread.sleep(3000);
		Homepage.oneway_btn(driver);
		Homepage.fill_fromfield(driver, "Allentown, PA - Lehigh Valley Intl (ABE");
		Homepage.fill_tofield(driver, "Atlanta, GA - Hartsfield-Jackson (ATL");
		Homepage.select_leave_date(driver, "04/12/2017");
		Homepage.clickSearch(driver);
		System.out.println("run successfully");
	}

	@Test
	public void roundTripTest() throws InterruptedException {
		Thread.sleep(3000);

		Homepage.rountrip_btn(driver);
		Homepage.fill_fromfield(driver, "Allentown, PA - Lehigh Valley Intl (ABE");
		Homepage.fill_tofield(driver, "Atlanta, GA - Hartsfield-Jackson (ATL");
		Homepage.select_leave_date(driver, "04/12/2017");
		Homepage.select_return_date(driver, "04/15/2017");
		Homepage.clickSearch(driver);
		System.out.println("round trip run successfully");
	}

	@Test
	public void ClickHref() {
		Homepage.click_today_deals(driver).getPageSource();
		assertEquals("Today's best fares", "Today's best fares");
	}

	@Test
	public void returnToHomepage() {
		Homepage.click_flight(driver);
	}

}
