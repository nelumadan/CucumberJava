package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"Stepdefinitions"},
tags="@testprojectdemo",
monochrome=true,
plugin={"pretty","html:target/HtmlReport","json:target/JsonReport","junit:target/JunitReport"})
public class TestRunnerTestProjectDemo 
{

}
