package com.bddinaction.chapter10.cucumber.steps;

import com.bddinaction.chapter10.cucumber.steps.persona.FrequentFlyerPersona;
import com.bddinaction.chapter10.model.FrequentFlyer;
import com.bddinaction.chapter10.model.Status;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.fest.assertions.Assertions.assertThat;

public class EarningStatus {

    private final FrequentFlyerHelper frequentFlyerHelper;

    public EarningStatus(FrequentFlyerHelper frequentFlyerHelper) {
        this.frequentFlyerHelper = frequentFlyerHelper;
    }

    String firstName;
    String lastName;

    @Given("^(\\S*) (\\S*) is not a Frequent Flyer member$")
    public void not_a_Frequent_Flyer_member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    FrequentFlyer member;

    @Given("^(.*) (.*) is a (.*) Frequent Flyer member$")
    public void a_Frequent_Flyer_member(String firstName, String lastName, Status status) {
        member = FrequentFlyer.withFrequentFlyerNumber("12345678")
                              .named(firstName,lastName);
        member.setStatus(status);
    }


    @When("^(?:s?)he registers on the Frequent Flyer program$")
    public void registers_on_the_Frequent_Flyer_program() throws Throwable {
        member = FrequentFlyer.withFrequentFlyerNumber("123456789")
                              .named(firstName, lastName);
    }

    @Given("^(?:s?)he has (.*) status points$")
    public void earned_status_points(int statusPoints) {
//        FrequentFlyer member = frequentFlyerHelper.getFrequentFlyer();
        member.setStatusPoints(statusPoints);
    }

    @When("^(?:s?)he earns (.*) extra status points$")
    public void earn_extra_status_points(int points) {
    //    FrequentFlyer member = frequentFlyerHelper.getFrequentFlyer();
        member.earns(points).statusPoints();
    }


    @Then("^(?:s?)he should have a status of (.*)$")
    public void should_have_status_of(Status expectedStatus) {
        //FrequentFlyer member = frequentFlyerHelper.getFrequentFlyer();
        assertThat(member.getStatus()).isEqualTo(expectedStatus);
    }
}
