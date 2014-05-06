package com.bddinaction.chapter10.cucumber.steps;

import com.bddinaction.chapter10.cucumber.steps.persona.FrequentFlyerPersona;
import com.bddinaction.chapter10.model.Status;
import cucumber.api.java.en.Given;

public class TransferSteps {

    private final FrequentFlyerHelper frequentFlyerHelper;

    public TransferSteps(FrequentFlyerHelper frequentFlyerHelper) {
        this.frequentFlyerHelper = frequentFlyerHelper;
    }

    @Given("^(.*) is a Frequent Flyer member$")
    public void Joe_is_a_Frequent_Flyer_member(FrequentFlyerPersona frequentFlyerPersona) throws Throwable {
        frequentFlyerHelper.setFrequentFlyer(frequentFlyerPersona.getFrequentFlyer());
    }

    @Given("I am a (.*) Frequent Flyer member")
    public void useAMemberWithAGivenStatus(Status status) {

    }
}
