package TestRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features = {"src/test/resources/Features/abc.feature"},
glue= {"stepdefinition"},
plugin = {"pretty","html:target/htmlreport.html"})


public class CucumberTestRunner extends AbstractTestNGCucumberTests{

	
}