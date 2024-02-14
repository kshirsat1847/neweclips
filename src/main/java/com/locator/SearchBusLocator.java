package com.locator;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SearchBusLocator {

	@FindBy(xpath = "//span[text()=\"Bus Tickets\"]")
	public WebElement searchbus;
	
	@FindBy(xpath = "//input[@id=\"src\"]")
	public WebElement onboarding;
	
	@FindBy(className = "labelCalendarContainer")
	public WebElement destination;
	
	
}
