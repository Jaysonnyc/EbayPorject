package com.ebay.runner;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(features = { "src/test/resources/FeatureFiles" }, 
				glue = { "com.ebay.stepdef", "com.ebay.utilities" }, 
				tags = {"@regression"}, 
				plugin = { "pretty", "html:target/cucumber-htmlreport", "json:target/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports.html" }, 
				monochrome = true)

public class RunnerClass extends AbstractTestNGCucumberTests{

/*	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }*/
	}