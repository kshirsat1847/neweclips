package com.StepDefination;

import com.util.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchBuses {

	Helper helper = new Helper();
	

@Given("open the given site by user {string}")
public void open_the_given_site_by_user(String string) {
    helper.openPage(string);
}

@Then("click on buses")
public void click_on_buses() {
    
}

@Then("insert onboarding station name")
public void insert_onboarding_station_name() {
    
}

@Then("insert destination station name")
public void insert_destination_station_name() {
    
}

@Then("select date")
public void select_date() {
    
}

@Then("click on search buses")
public void click_on_search_buses() {
    Helper.tearDown();
}



	
}
