package com.bddinaction.chapter10.cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"json:target/cucumber.json", "html:target/cucumber-html-report"})
public class AcceptanceTestSuite {
}
