package com.util;

import java.time.Duration;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

	private static Helper helperobj;
	private static WebDriver driver;
	private static WebDriverWait wait;
	
	public Helper() {
		driver= new ChromeDriver();
		wait= new WebDriverWait(driver, Duration.ofSeconds(4));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static void setUpDriver() {
		if(driver==null) {
			helperobj= new Helper();
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
		}
		helperobj=null;
	}
	
}
