package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\vinot\\eclipse-workspace\\baseClass\\src\\test\\resources\\Feature\\Cucum.feature",
glue= {"org.StepDef"},monochrome=true)
public class TestRunner {

}
