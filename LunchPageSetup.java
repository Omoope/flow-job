package com.page_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class LunchPageSetup {

	public WebDriver driver;

	public LunchPageSetup() {
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver(WebDriver driver) {
		return driver = this.driver;
	}

	public void SetupBrowser(String Browser, String BrowserURL) {
		if (Browser == "firefox") {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Follow\\Desktop\\Seleniumtools\\geckodriver.exe");
			driver = new FirefoxDriver(); // Web browser
			driver.manage().window().maximize(); // Manage windows
			driver.navigate().to(BrowserURL); // to get URL
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		} else if (Browser == "chrome") {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Follow\\Desktop\\Seleniumtools\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to(BrowserURL);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		}

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Browser closed");

	}

}
