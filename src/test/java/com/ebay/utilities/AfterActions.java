package com.ebay.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {
	
	@After
	public void afterActions(Scenario Scenario) throws Exception{
		
	
	TakeScreenshot TakeScreenshotObj = new TakeScreenshot();
	
	//if(Scenario.isFailed()){
			TakeScreenshotObj.screenshots();
			
	//}
			
		
		
		SetupDrivers.tearDownDriver();
		System.out.println(" ------Test Complete, Browser Closed ");
	}
}
