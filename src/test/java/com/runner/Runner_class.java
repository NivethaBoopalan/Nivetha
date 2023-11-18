package com.runner;
 
import org.junit.runner.RunWith;

import com.Base.Base_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Admin\\eclipse-workspace\\Lime_Kids\\src\\test\\java\\com\\kidsfeature\\Kids.feature"},
		                    glue="com.step",monochrome=true,
		                    dryRun=false,
		                    strict=true,
		                    plugin= {"pretty","json:kidsformat/jsonformat.json","html:kidsformat/htmlformat.html",
		                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})                 

public class Runner_class extends Base_class{

}
