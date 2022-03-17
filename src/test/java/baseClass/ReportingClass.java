package baseClass;

import java.io.File;

import javax.security.auth.login.Configuration;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions (features= {"C:\\Users\\vinot\\eclipse-workspace\\baseClass\\src\\test\\resources\\Feature\\Cucum.feature"},
glue= {"org.StepDef"},monochrome=true,dryRun=false,plugin= {"pretty","json:C:\\Users\\vinot\\eclipse-workspace\\baseClass\\target.json"})
public class ReportingClass {

private void generatingJVMReport(String Json) {
File file=new File("C:\\Users\\vinot\\eclipse-workspace\\baseClass\\target");
Configuration config=new Configuration();
config.getConfiguration();



}
}
