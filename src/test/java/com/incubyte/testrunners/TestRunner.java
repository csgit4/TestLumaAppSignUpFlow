package com.incubyte.testrunners;


//following setup is for junit
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		
//		features = "./src/test/resources/org/features",
//		glue = "com/incubyte/stepdefinitions",
//		dryRun = true,
//		monochrome = true
//		
//		)
//public class TestRunner {
//
//}

//=====================================================
//following setup is for testng

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "./src/test/resources/org/features",
		glue = {"com/incubyte/stepdefinitions","com/incubyte/lumaapphucks"},
		dryRun = false,
	    monochrome = true,
//	    tags = "@smoke, @regression",
	    plugin = {"pretty",
	    		 "html:Reports/html_report/cucumber_report.html",
	    		 "junit:Reports/junit_report/junit_report.junit",
	    		 "json:Reports/json_report/json_report.json",
	    		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		         }
		) 
public class TestRunner extends AbstractTestNGCucumberTests {

}
