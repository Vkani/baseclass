package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\vinot\\eclipse-workspace\\baseClass\\src\\test\\resources\\Feature\\adactin.feature"},
glue= {"org.datatable"},dryRun=false,monochrome=true)

public class AdactinTestRunner {
	
}
