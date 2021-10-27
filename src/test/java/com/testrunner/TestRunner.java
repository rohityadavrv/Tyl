package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = "src/test/resources/features",
		glue = "com/stepDefinitions",
		plugin = {"html:target",
				"json:target/results/cucumber-report.json"},
		tags = {"@StandardUser"})

public class TestRunner {
	
	
}