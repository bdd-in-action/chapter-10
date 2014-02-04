package com.bddinaction.chapter10.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * A description goes here.
 * User: john
 * Date: 12/01/2014
 * Time: 11:20 AM
 */
@RunWith(Cucumber.class)
@CucumberOptions(tags={"@iteration-1"})
@Cucumber.Options(format = {"html:target/iteration-1-html-report"})
public class Iteration1TestSuite {
}