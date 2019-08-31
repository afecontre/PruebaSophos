package com.promart.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\com\\promart\\www\\features\\comprapromart.feature",
		glue= "com.promart.www.stepdefinitions", 
		snippets = SnippetType.CAMELCASE)

public class RunnerTestSite {

}
