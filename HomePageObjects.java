package com.fly.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
 * This is contains all the page objects
 * 
 */
public class HomePageObjects extends LaunchSetUp{
	
	By fromField = By.id("from-field");
	By toField = By.id("to-field");
	By departDate = By.id("date-depart");
	By returnDate = By.id("date-return");
	By searchButton = By.id("search-btn");
	
	WebElement fill_from;
	WebElement fill_to;
	WebElement fill_departDate;
	WebElement fill_returnDate;
	WebElement clickSearchButton;
	
	public void typeFromLocation(String location_name){
		driver.findElement(By.id("from-field")).clear();
		driver.findElement(By.id("from-field")).sendKeys(location_name);
	}
	
	public void typeToLocation(String location){
		driver.findElement(By.id("to-field")).sendKeys(location);
	}
	
	public void typeDepartureDate(String date){
		driver.findElement(By.id("date-depart")).sendKeys(date);
	}
	
	public void typeReturnDate(String date){
		driver.findElement(By.id("date-return")).sendKeys(date);
	}
	
	public void clickSearchButton(){
		driver.findElement(By.id("search-btn")).click();
	}
}
