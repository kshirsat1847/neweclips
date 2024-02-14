package com.Action;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.util.Helper;

import io.cucumber.java.eo.Se;

public class SearchBusAction {
	Helper helper = new Helper();
	SearchBusAction searchobj;
	public SearchBusAction() {
		searchobj= new SearchBusAction();
		PageFactory.initElements(Helper.getDriver(), searchobj);
		
	}
	
	

}
